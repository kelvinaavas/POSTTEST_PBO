# SISTEM ANTRIAN BARBER SHOP

## Deskripsi Proyek

Program Sistem Antrian Barber Shop merupakan aplikasi sederhana berbasis
Java yang digunakan untuk mengelola antrian pelanggan pada sebuah barber
shop.

Program ini memungkinkan pelanggan mengambil nomor antrian, melihat
status antrian, mengubah status ketika pelayanan selesai, serta
menghapus data antrian yang sudah selesai. Sistem ini dibuat menggunakan
konsep Object-Oriented Programming (OOP) dan menggunakan ArrayList untuk
menyimpan data pelanggan secara dinamis.

------------------------------------------------------------------------

## Tujuan Proyek

1.  Menyelesaikan tugas praktikum Pemrograman Berorientasi Objek (PBO).
2.  Mengimplementasikan konsep Object-Oriented Programming (OOP)
    menggunakan Java.
3.  Mempraktikkan operasi CRUD (Create, Read, Update, Delete).
4.  Menggunakan ArrayList sebagai struktur penyimpanan data.
5.  Membuat sistem antrian sederhana untuk barber shop.

------------------------------------------------------------------------

## Fitur Utama

### 1. Ambil Nomor Antrian

-   Pelanggan dapat mengambil nomor antrian.
-   Sistem akan menambahkan pelanggan ke dalam daftar antrian.
-   Status awal pelanggan adalah "Menunggu".

### 2. Lihat Status Antrian

-   Menampilkan seluruh daftar pelanggan yang sedang mengantri.
-   Informasi yang ditampilkan meliputi nomor antrian, nama pelanggan,
    dan status pelayanan.

### 3. Selesai Potong

-   Digunakan untuk mengubah status pelanggan menjadi "Selesai Potong"
    setelah pelayanan selesai.

### 4. Hapus Antrian

-   Menghapus data pelanggan dari daftar antrian.

------------------------------------------------------------------------

## Struktur Class

Program ini terdiri dari tiga class utama.

### Class Customer

    - nomor : int
    - nama : String
    - status : String

    + getNomor() : int
    + getNama() : String
    + getStatus() : String
    + setNama(String nama) : void
    + setStatus(String status) : void

Class ini berfungsi sebagai model data pelanggan yang menyimpan nomor
antrian, nama pelanggan, dan status pelayanan.

------------------------------------------------------------------------

### Class AntrianService

    - daftar : ArrayList<Customer>

    + ambilNomor(int nomor, String nama) : void
    + lihatStatus() : void
    + updateStatus(int nomor) : void
    + hapusAntrian(int nomor) : void

Fungsi method: - ambilNomor() digunakan untuk menambahkan pelanggan ke
dalam daftar antrian. - lihatStatus() digunakan untuk menampilkan semua
data antrian. - updateStatus() digunakan untuk mengubah status pelanggan
menjadi selesai potong. - hapusAntrian() digunakan untuk menghapus data
pelanggan dari daftar antrian.

------------------------------------------------------------------------

### Class BarberShop

Class BarberShop merupakan class utama yang menjalankan program.

    public static void main(String[] args)

Menu program:

    1. Ambil Nomor
    2. Lihat Status Antrian
    3. Selesai Potong
    4. Hapus Antrian
    5. Exit

------------------------------------------------------------------------

## Alur Program

    START PROGRAM
          |
          v
    MENU UTAMA
    1. Ambil Nomor
    2. Lihat Status
    3. Selesai Potong
    4. Hapus Antrian
    5. Exit
          |
          v
    Pengguna memilih menu
          |
          v
    Program menjalankan fungsi sesuai pilihan
          |
          v
    Kembali ke menu utama
          |
          v
    Exit Program

------------------------------------------------------------------------

## Contoh Output Program

### Menu Utama

    === SISTEM ANTRIAN BARBER SHOP ===
    1. Ambil Nomor
    2. Lihat Status Antrian
    3. Selesai Potong
    4. Hapus Antrian
    5. Exit
    Pilih menu:

### Ambil Nomor

    Masukkan nama: Andi
    Nomor antrian 1 berhasil dibuat

### Lihat Status Antrian

    Nomor: 1 Nama: Andi Status: Menunggu
    Nomor: 2 Nama: Budi Status: Menunggu

### Selesai Potong

    Masukkan nomor antrian: 1
    Status berhasil diubah

### Hapus Antrian

    Masukkan nomor antrian: 1
    Data antrian dihapus

------------------------------------------------------------------------

## Konsep OOP yang Digunakan

1.  Class dan Object\
    Class yang digunakan adalah Customer, AntrianService, dan
    BarberShop.

2.  Encapsulation\
    Data pada class Customer dibuat private dan diakses menggunakan
    getter dan setter.

3.  ArrayList\
    Digunakan untuk menyimpan data pelanggan secara dinamis.

4.  Looping\
    Digunakan untuk menampilkan semua data antrian.

5.  Conditional\
    Menggunakan if dan switch untuk menentukan alur program.

6.  CRUD Operations

    -   Create: menambahkan antrian baru\
    -   Read: melihat status antrian\
    -   Update: mengubah status pelanggan\
    -   Delete: menghapus data antrian

------------------------------------------------------------------------

## Kesimpulan

Program Sistem Antrian Barber Shop berhasil dibuat menggunakan bahasa
pemrograman Java dengan menerapkan konsep Object-Oriented Programming
(OOP). Program ini dapat mengelola antrian pelanggan secara sederhana
dengan fitur menambah, melihat, memperbarui, dan menghapus data antrian.

Program ini membantu mengatur antrian pelanggan agar lebih tertib dan
mudah dikelola.
