import java.io.*;
import java.util.*;

public class Latihan2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String csvKaryawan = "C://Downloads/dataKaryawan.csv";
        String txtKaryawan = "C://dataKaryawan/dataKaryawan.txt";
        File csvFile = new File(csvKaryawan);
        File txtFile = new File(txtKaryawan);
        String csvTraining = "C://dataTraining/dataTraining.csv";
        String txtTraining = "C://dataTraining/dataTraining.txt";
        File csvFileTrain = new File(csvTraining);
        File txtFileTrain = new File(txtTraining);
        int pilih;
        do {
            System.out.println("===MENU===");
            System.out.println("1. Generate File txt dari data Karyawan");
            System.out.println("2. Generate File txt dari data Training");
            System.out.println("3. Generate File txt dari kedua Nya");
            System.out.println("0. EXIT");
            System.out.println("Pilih : ");
            pilih = scanner.nextInt();
            switch (pilih) {
                case 1:
                    if (!csvFile.exists()) {
                        System.out.println("File data Karywan.csv tidak ditemukan");
                        break;
                    }
                    try {
                        FileWriter writer = new FileWriter(txtFile);
                        BufferedReader reader = new BufferedReader(new FileReader(csvFile));
                        String line;
                        while ((line = reader.readLine()) != null) {
                            String[] data = line.split(",");
                            String nama = data[0];
                            String nik = data[1];
                            String gender = data[2];
                            String status = data[3];
                            String text = String.format("Nama: %s,Nik: %s,Gender: %s, Status: %s%n", nama, nik, gender, status);
                            writer.write(text);
                        }
                        writer.close();
                        System.out.println("File berhasil di generate di direktori " + txtKaryawan);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    //Generate file txt dari data training
                    if (!csvFileTrain.exists()) {
                        System.out.println("File data Training.csv tidak ditemukan" + csvFileTrain);
                        break;
                    }
                    try {
                        FileWriter writer = new FileWriter(txtFileTrain);
                        BufferedReader reader = new BufferedReader(new FileReader(csvFileTrain));
                        String line;
                        while ((line = reader.readLine()) != null) {
                            String[] data = line.split(",");
                            String pengajar = data[0];
                            String tema = data[1];
                            String judul = data[2];
                            String durasi = data[3];
                            String text = String.format("Pengajar: %s, Tema: %s, Judul: %s, Durasi: %s%n", pengajar, tema, judul, durasi);
                            writer.write(text);
                        }
                        writer.close();
                        System.out.println("File berhasil di generate di direktori " + txtTraining);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    // kode untuk generate file txt dari keduanya
                    String csvFilePathK = "C://dataKaryawan/datakaryawan.csv";
                    String csvFilePathT = "C://dataTraining/datatraining.csv";
                    String txtFilePathB = "C://dataBoth/bothtxt.txt";
                    File csvFileK = new File(csvFilePathK);
                    File csvFileT = new File(csvFilePathT);
                    File txtFileB = new File(txtFilePathB);
                    if (!csvFile.exists() || !csvFile.exists()) {
                        System.out.println("File datakaryawan.csv atau datatraining.csv tidak ditemukan di folder " + csvFilePathK + " atau " + csvFilePathT);
                        break;
                    }
                    try {
                        FileWriter writer = new FileWriter(txtFileB);
                        BufferedReader reader1 = new BufferedReader(new FileReader(csvFileK));
                        BufferedReader reader2 = new BufferedReader(new FileReader(csvFileT));
                        String line;
                        while ((line = reader1.readLine()) != null) {
                            String[] data = line.split(",");
                            String nama = data[0];
                            String nik = data[1];
                            String gender = data[2];
                            String status = data[3];
                            String text = String.format("Nama: %s, NIK: %s, Gender: %s, Status: %s%n", nama, nik, gender, status);
                            writer.write(text);
                        }
                        while ((line = reader2.readLine()) != null) {
                            String[] data = line.split(",");
                            String pengajar = data[0];
                            String tema = data[1];
                            String judul = data[2];
                            String durasi = data[3];
                            String text = String.format("Pengajar: %s, Tema: %s, Judul: %s, Durasi: %s%n", pengajar, tema, judul, durasi);
                            writer.write(text);
                        }
                        writer.close();
                        System.out.println("File berhasil di-generate di direktori " + txtFilePathB);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 0:
                    System.out.println("Keluar dari aplikasi...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan pilih lagi.");
            }
        } while (pilih != 0);

        scanner.close();
    }
}







