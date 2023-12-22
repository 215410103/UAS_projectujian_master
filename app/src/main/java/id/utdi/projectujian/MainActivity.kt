package id.utdi.projectujian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // untuk menampilkan hasil project yg di kerjakan di mainActivity
           imageAdapter()
        //  textAdapter()
        //   numberAdapter()
            modelAdapter()
    }
    // menampilkan gambar berserta judul pada movie tersebut,
    // R.drawble memangil id gambar yang tersimpan pada res bagian drawable
    private fun modelAdapter(){
        val movies = listOf<MovieModel>(
            MovieModel(1, "Tanaman Daun Sirih:Beberapa manfaat daun sirih meliputi mengatasi keputihan, penyembuhan luka pasca melahirkan, perawatan mata, kesehatan reproduksi, pencegahan bau badan, pengobatan jerawat, pembersih wajah alami, pengobatan sakit gigi, pengobatan masalah gusi, pengobatan sakit perut, menguatkan gigi, pengobatan sariawan,", R.drawable.gambar1),
            MovieModel(2, "Kumis Kucing : Salah satu manfaat kumis kucing yang paling tersohor adalah mengobati infeksi saluran kencing dan penyakit ginjal. Kumis kucing pada umumnya dijadikan obat herbal untuk melawan infeksi bakteri, seperti pada luka di kulit atau gusi yang bengkak.", R.drawable.gambar2),
            MovieModel(3, "Daun Suruhan : Daun suruhan mengandung berbagai macam zat aktif dan nutrisi yang bermanfaat bagi kesehatan tubuh. Seluruh bagian tanaman ini pada dasarnya dapat digunakan sebagai obat, tapi paling sering adalah bagian daunnya. ", R.drawable.gambar3),
            MovieModel(4, "Daun Pegagan : Mengurangi Kecemasan, Stres dan Depresi, Membantu Meringankan Insomnia, Membantu Mengurangi Stretch Mark, Mempercepat Proses Penyembuhan Luka dan Bekas Luka, Membantu Meredakan Nyeri Sendi, Mengobati dan Mencegah Jerawat, Membantu Meningkatkan Fungsi Kognitif, Membantu Mengobati Penyakit Alzheimer.", R.drawable.gambar4),
            MovieModel(5, "Kunyit : Dalam beberapa penelitian menyebutkan manfaat kunyit yaitu:digunakan sebagai obat penyakit ganguan pencernaan, pembersih darah, penguat jantung, penguat lambung, peluruh kencing, didamping itu bermanfaat sebagai anti inflamasi, anti oksidan, anti bakteri, pencegah kanker, menurunkan kadar lemak darah dan kolesterol.", R.drawable.gambar5),
            MovieModel(6, "Jahe : Menurunkan Glukosa Darah dan Kolesterol, Anti Penuaan, Meredakan Nyeri Menstruasi, Meredakan Sakit Otot, Menangkal Infeksi Virus dan Bakteri, Menguatkan Sistem Imun Tubuh, Mengobati Masalah Pencernaan, Mengurangi Rasa Mual.", R.drawable.gambar6),
            MovieModel(7, "Daun Balakacida : Daun Balakacida, yang juga dikenal sebagai rumput minjangan, memiliki keberadaan yang cukup luas di seluruh Indonesia. Tanaman ini sering tumbuh subur di berbagai jenis lahan, mulai dari daerah kering, pegunungan, hingga lahan basah seperti rawa-rawa.", R.drawable.gambar7),
        )
        val movieAdapter = MovieAdapter(movies)
        findViewById<RecyclerView>(R.id.recyclerView).adapter = movieAdapter
    }

    private fun imageAdapter(){
        val images = listOf<Int>(
            R.drawable.gambar1,
            R.drawable.gambar2,
            R.drawable.gambar3,
            R.drawable.gambar4,
            R.drawable.gambar5,
            R.drawable.gambar6,
            R.drawable.gambar7,
        )

        val imageAdapter = ImageAdapter(images)
        findViewById<RecyclerView>(R.id.recyclerView).apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter =imageAdapter
        }
    }




    private fun textAdapter() {
        val names = listOf<String>(

        )
        // Log.e("MainaActivity", " size{${names.size}}")
        // Log.e("MainaActivity", names[1])
        names.forEach { name ->
            Log.e("MainaActivity", name)
        }

            val textAdapter = TextAdapter(names)
            findViewById<RecyclerView>(R.id.recyclerView).adapter = textAdapter

    }
    private fun numberAdapter(){
        val numbers = listOf<Int>(
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
        )
        val numberAdapter = NumberAdapter ( numbers )
        findViewById<RecyclerView>(R.id.recyclerView).adapter = numberAdapter


    }
}