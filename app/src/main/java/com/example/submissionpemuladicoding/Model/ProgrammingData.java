package com.example.submissionpemuladicoding.Model;

import com.example.submissionpemuladicoding.R;

import java.util.ArrayList;

public class ProgrammingData {

    private static String[] programmingNames = {
            "Java",
            "Kotlin",
            "JavaScript",
            "C#",
            "Ruby",
            "Python",
            "PHP",
            "Pascal",
            "Dart",
            "C++"
    };

    private static String [] programmingDetail = {
            "Java adalah bahasa pemrograman yang dapat dijalankan di berbagai komputer termasuk telepon genggam. Bahasa ini awalnya dibuat oleh James Gosling saat masih bergabung di Sun Microsystems saat ini merupakan bagian dari Oracle dan dirilis tahun 1995. Bahasa ini banyak mengadopsi sintaksis yang terdapat pada C dan c_plus namun dengan sintaksis model objek yang lebih sederhana serta dukungan rutin-rutin aras bawah yang minimal. Aplikasi-aplikasi berbasis java umumnya dikompilasi ke dalam p-code (bytecode) dan dapat dijalankan pada berbagai Mesin Virtual Java (JVM). Java merupakan bahasa pemrograman yang bersifat umum/non-spesifik (general purpose), dan secara khusus didisain untuk memanfaatkan dependensi implementasi seminimal mungkin. Karena fungsionalitasnya yang memungkinkan aplikasi java mampu berjalan di beberapa platform sistem operasi yang berbeda, java dikenal pula dengan slogannya, \"Tulis sekali, jalankan di mana pun\". Saat ini java merupakan bahasa pemrograman yang paling populer digunakan, dan secara luas dimanfaatkan dalam pengembangan berbagai jenis perangkat lunak aplikasi ataupun aplikasi",
            "Kotlin adalah sebuah bahasa pemrograman dengan pengetikan statis yang berjalan pada Mesin Virtual Java ataupun menggunakan kompiler LLVM yang dapat pula dikompilasikan kedalam bentuk kode sumber JavaScript. Pengembang utamanya berasal dari tim programer dari JetBrains yang bermarkas di Rusia.[2] Meskipun sintaksisnya tidak kompatibel dengan bahasa Java, Kotlin didesain untuk dapat bekerja sama dengan kode bahasa Java dan bergantung kepada kode bahasa Java dari Kelas Pustaka Java yang ada, seperti berbagai framework Java yang ada. Tim Pengembang memutuskan menamakannya Kotlin dengan mengambil nama dari sebuah pulau di Rusia, sebagaimana Java yang mengambil nama dari pulau Jawa di Indonesia.[3] Setelah Google mengumumkan bahwa Kotlin menjadi bahasa kelas satu bagi Android, maka bersama Java dan c_plus, Kotlin menjadi bahasa resmi untuk pengembangan aplikasi-aplikasi Android.[4]",
            "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis.[4] JavaScript populer di internet dan dapat bekerja di sebagian besar penjelajah web populer seperti Google Chrome, Internet Explorer (IE), Mozilla Firefox, Netscape dan Opera. Kode JavaScript dapat disisipkan dalam halaman web menggunakan tag SCRIPT.[5] JavaScript merupakan salah satu teknologi inti World Wide Web selain HTML dan CSS. JavaScript membantu membuat halaman web interaktif dan merupakan bagian aplikasi web yang esensial.",
            "c_sharp merupakan sebuah bahasa pemrograman yang berorientasi objek yang dikembangkan oleh Microsoft sebagai bagian dari inisiatif kerangka .NET Framework. Bahasa pemrograman ini dibuat berbasiskan bahasa c_plus yang telah dipengaruhi oleh aspek-aspek ataupun fitur bahasa yang terdapat pada bahasa-bahasa pemrograman lainnya seperti Java, Delphi, Visual Basic, dan lain-lain) dengan beberapa penyederhanaan. Menurut standar ECMA-334 c_sharp Language Specification, nama c_sharp terdiri atas sebuah huruf Latin C (U+0043) yang diikuti oleh tanda pagar yang menandakan angka # (U+0023). Tanda pagar # yang digunakan memang bukan tanda kres dalam seni musik (U+266F), dan tanda pagar # (U+0023) tersebut digunakan karena karakter kres dalam seni musik tidak terdapat di dalam keyboard standar.",
            "Ruby adalah bahasa pemrograman dinamis berbasis skrip yang berorientasi objek. Tujuan dari ruby adalah menggabungkan kelebihan dari semua bahasa-bahasa pemrograman skrip yang ada di dunia. Ruby ditulis dengan bahasa pemrograman C dengan kemampuan dasar seperti Perl dan Python.",
            "Python adalah bahasa pemrograman interpretatif multiguna[9] dengan filosofi perancangan yang berfokus pada tingkat keterbacaan kode.[10] Python diklaim sebagai bahasa yang menggabungkan kapabilitas, kemampuan, dengan sintaksis kode yang sangat jelas,[11] dan dilengkapi dengan fungsionalitas pustaka standar yang besar serta komprehensif. Python juga didukung oleh komunitas yang besar.",
            "PHP: Hypertext Preprocessor[3] adalah bahasa skrip yang dapat ditanamkan atau disisipkan ke dalam HTML.[4][5] PHP banyak dipakai untuk memprogram situs web dinamis. PHP dapat digunakan untuk membangun sebuah CMS.",
            "Pascal adalah bahasa pemrograman yang pertama kali di buat oleh Profesor Niklaus Wirth, seorang anggota International Federation of Information Processing (IFIP) pada tahun 1971. Dengan mengambil nama dari matematikawan Prancis, Blaise Pascal, yang pertama kali menciptakan mesin penghitung, Profesor Niklaus Wirth membuat bahasa Pascal ini sebagai alat bantu untuk mengajarkan konsep pemrograman komputer kepada mahasiswanya. Selain itu, Profesor Niklaus Wirth membuat Pascal juga untuk melengkapi kekurangan-kekurangan bahasa pemrograman yang ada pada saat itu.",
            "Dart adalah bahasa pemrograman yang dioptimalkan klien untuk aplikasi cepat di berbagai platform. Ini dikembangkan oleh Google dan digunakan untuk membangun aplikasi mobile, desktop, backend, dan web.\n" +
                    "\n" +
                    "Dart adalah bahasa berorientasi objek (OOP), didefinisikan dengan kelas, menggunakan sintaks C-style yang transcompile opsional ke JavaScript. Ini mendukung antarmuka, mixin, kelas abstrak, generik reified, pengetikan statis, dan sistem tipe suara.",
            "c_plus adalah bahasa pemrograman komputer yang di buat oleh Bjarne Stroustrup, yang merupakan perkembangan dari bahasa C dikembangkan di Bong Labs (Dennis Ritchie) pada awal tahun 1970-an, Bahasa itu diturunkan dari bahasa sebelumnya, yaitu B, Pada awalnya, bahasa tersebut dirancang sebagai bahasa pemrograman yang dijalankan pada sistem Unix, Pada perkembangannya, versi ANSI (American National Standart Institute) Bahasa pemrograman C menjadi versi dominan, Meskipun versi tersebut sekarang jarang dipakai dalam pengembangan sistem dan jaringan maupun untuk sistem embedded, Bjarne Stroustrup pada Bel labs pertama kali mengembangkan c_plus pada awal 1980-an. Untuk mendukung fitur-fitur pada c_plus, dibangun efisiensi dan sistem support untuk pemrograman tingkat rendah (low level coding).[1] Pada c_plus ditambahkan konsep-konsep baru seperti class dengan sifat-sifatnya seperti inheritance dan overloading.[butuh rujukan] Salah satu perbedaan yang paling mendasar dengan bahasa C adalah dukungan terhadap konsep pemrograman berorientasi objek (Object Oriented Programming).[2]\n" +
                    "\n" +
                    "tercipta untuk mu .[3]"
    };

    private static int [] programmingImages = {
            R.drawable.java,
            R.drawable.kotlin,
            R.drawable.js,
            R.drawable.c_sharp,
            R.drawable.ruby,
            R.drawable.python,
            R.drawable.php,
            R.drawable.pascal,
            R.drawable.dart,
            R.drawable.c_plus
    };

     public static ArrayList<Programming> getListData() {
        ArrayList<Programming> list = new ArrayList<>();
        for (int position = 0; position < programmingNames.length; position++) {
            Programming p = new Programming();
            p.setName(programmingNames[position]);
            p.setDetail(programmingDetail[position]);
            p.setPhoto(programmingImages[position]);
            list.add(p);
        }
        return list;
    }
}
