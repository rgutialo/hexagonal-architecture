package com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.csv.repository;

import com.example.hexagonal.application.port.out.SaveMultiplicationPort;
import com.example.hexagonal.domain.model.Multiplication;
import com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.csv.entity.MultiplicationCSV;
import com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.csv.mapper.MultiplicationCsvMapper;
import lombok.AllArgsConstructor;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.OptionalInt;
import java.util.stream.Stream;

@AllArgsConstructor
public class SaveMultiplicationCSVAdapter implements SaveMultiplicationPort {

    private static final String CSV_PATH = "multiplications.csv";
    private static final String HEADER = "id,multiplicand,multiplier,result";


    private final MultiplicationCsvMapper multiplicationCsvMapper;

    @Override
    public void save(Multiplication multiplication) {

        try {
            MultiplicationCSV csvFromModel = multiplicationCsvMapper.createCsvFromModel(multiplication);

            Path path = Paths.get(CSV_PATH);

            boolean fileExists = Files.exists(path);

            if (!fileExists) {
                // Create file and write header
                try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.CREATE)) {
                    writer.write(HEADER);
                    writer.newLine();
                }
            }

            // Determine the next ID
            int nextId = 1;
            try (Stream<String> lines = Files.lines(path)) {
                OptionalInt maxId = lines
                        .skip(1) // skip header
                        .map(line -> line.split(",")[0])
                        .filter(idStr -> idStr.matches("\\d+"))
                        .mapToInt(Integer::parseInt)
                        .max();

                if (maxId.isPresent()) {
                    nextId = maxId.getAsInt() + 1;
                }
            }

            // Assign the generated ID
            csvFromModel.setId(nextId);

            // Append the new entry
            try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
                writer.write(String.format("%d,%d,%d,%d%n",
                        csvFromModel.getId(),
                        csvFromModel.getMultiplicand(),
                        csvFromModel.getMultiplyier(),
                        csvFromModel.getResult()));
            }
        } catch (
                Exception e) {
            System.err.println("Error saving multiplication to CSV: " + e.getMessage());
        }

    }
}
