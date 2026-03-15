# Posttest 2 - Sistem Antrian Barber Shop

## Deskripsi
Program ini merupakan pengembangan dari Posttest 1 dengan menerapkan konsep
Encapsulation dan Access Modifier dalam pemrograman berorientasi objek (OOP).

Program digunakan untuk mengelola antrian pelanggan pada barber shop.

## Fitur Program
1. Ambil nomor antrian
2. Melihat daftar antrian
3. Mengubah status pelanggan menjadi selesai potong
4. Menghapus antrian
5. Keluar dari program

## Konsep OOP yang Digunakan

### 1. Encapsulation
Data dalam class Customer dibuat private sehingga tidak dapat diakses langsung
dari luar class.

Contoh:
private int nomor;
private String nama;
private String status;

Akses terhadap data dilakukan melalui method getter dan setter.

### 2. Access Modifier
Access modifier yang digunakan:

- private → atribut class
- public → method
- default → class

### 3. Getter dan Setter

Getter:
getNomor()
getNama()
getStatus()

Setter:
setNama()
setStatus()

Getter dan setter digunakan untuk mengambil dan mengubah nilai atribut
tanpa mengaksesnya secara langsung.

## Struktur Class

Customer.java → menyimpan data pelanggan  
AntrianService.java → mengelola antrian pelanggan  
BarberShop.java → program utama (menu)

## Cara Menjalankan Program

1. Compile program
2. Jalankan class BarberShop
3. Pilih menu sesuai kebutuhan