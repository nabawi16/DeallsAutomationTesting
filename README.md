UI Automation Challenge - Web Scenarios (Katalon Studio)
Overview
Dokumen ini berisi skrip otomatisasi UI yang dibuat untuk Challenge : UI Automation - Web Scenarios. Skrip ini dikembangkan menggunakan Katalon Studio untuk mengotomatisasi skenario pengujian pada aplikasi web.
Tech Stack
- Framework: Katalon Studio
- Language: Groovy
- Testing Approach: End-to-End (E2E) testing

Test Scenarios
Skrip otomatisasi mencakup beberapa skenario utama:
- Registrasi & Login
- Pengguna registrasi sebagai mentor/mentee.
- Pengguna login dengan kredensial benar/salah.
- Reset password jika lupa.
- Pencarian Mentor
- Pencarian mentor berdasarkan kategori atau bidang keahlian.
- Pencarian tanpa filter untuk menampilkan semua mentor.
- Penjadwalan Mentoring
- Pemilihan slot waktu tersedia.
- Konfirmasi dan pembatalan sesi mentoring.

Installation & Setup
Untuk menjalankan tes, ikuti langkah-langkah berikut:
1. Install Katalon Studio
- Unduh dan instal dari Katalon Website.
- Buka Katalon Studio dan buat Project Baru.
2. Clone Repository
git clone <repository-url>
cd <project-folder>
3. Import Test Cases ke Katalon
- Buka Katalon Studio, lalu pilih File > Import Test Case.
- Pilih file skrip otomatisasi yang sesuai.
4. Run Test Cases
- Pilih Test Suite atau Test Case yang akan dijalankan.
- Klik Run untuk mulai eksekusi.

Test Execution
- Semua test cases berada dalam folder Test Cases di Katalon Studio.
- Struktur skrip memanfaatkan objek dari Object Repository untuk interaksi dengan elemen UI.
Code Structure
📂 project-folder  
 ├── 📂 Test Cases  
 │   ├── TC_Login.groovy  # Skrip otomatisasi login  
 │   ├── TC_SearchMentor.groovy  # Skrip pencarian mentor  
 │   ├── TC_ScheduleMentoring.groovy  # Skrip penjadwalan mentoring  
 ├── 📂 Object Repository  
 │   ├── LoginPage/  # Elemen UI halaman login  
 │   ├── SearchPage/  # Elemen UI halaman pencarian  
 ├── 📂 Test Suites  
 │   ├── MentoringFeatureSuite/  # Kumpulan test cases  
 ├── katalon.project  # File konfigurasi Katalon  


Author
Nama: Ahmad Nabawi
Framework: Katalon Studio
Skenario yang diuji: Login, Pencarian Mentor, Penjadwalan Mentoring
