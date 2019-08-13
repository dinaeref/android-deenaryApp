package com.drf.myapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ItemData {
    public static String[][] data = new String[][] {
            {"Binbook A5 - Music",
                    "Rp 35.000",
                    "Binbook (Binder Notebook) adalah notebook yang memiliki ring binder sebagai penjepitnya. \n" +
                            "Bentuknya seperti notebook pada umumnya, namun notebook yang satu ini bisa diisi ulang seperti binder.\n" +
                            "\n" +
                            "\n" +
                            "Ukuran : A5 (20 Ring)\n" +
                            "150mm x 210mm (15cm x 21cm)\n" +
                            "\n" +
                            "DETAIL PRODUK\n" +
                            "- 1 buah ring binder untuk menjepit kertas binder\n" +
                            "- 2 lembar pp pattern cover\n" +
                            "- 2 lembar cover depan belakang (gambar random, tapi jangan cemas karena gambarnya lucu-lucu ^^)\n" +
                            "- 2 lembar pembatas binder polos putih\n" +
                            "- 50 lembar kertas isi binder putih bergaris\n" +
                            "\n" +
                            "Binbook ini sangat cocok untuk menjadi buku catatan kuliah atau sekolah karena lebih mudah dan praktis untuk dibawa.",
                    "https://i.ibb.co/V9BYLCz/deenary-id-64860102-736193763505258-6922611011634338086-n.jpg"},
            {"Binbook B5 - Monkey",
                    "Rp 45.000",
                    "Binbook (Binder Notebook) adalah notebook yang memiliki ring binder sebagai penjepitnya. \n" +
                            "Bentuknya seperti notebook pada umumnya, namun notebook yang satu ini bisa diisi ulang seperti binder.\n" +
                            "\n" +
                            "\n" +
                            "Ukuran : B5 (26 Ring)\n" +
                            "182mm x 257mm (18.2cm x 25.7cm)\n" +
                            "\n" +
                            "DETAIL PRODUK\n" +
                            "- 1 buah ring binder untuk menjepit kertas binder\n" +
                            "- 2 lembar pp pattern cover\n" +
                            "- 2 lembar cover depan belakang (gambar random, tapi jangan cemas karena gambarnya lucu-lucu ^^)\n" +
                            "- 2 lembar pembatas binder polos putih\n" +
                            "- 50 lembar kertas isi binder putih bergaris\n" +
                            "\n" +
                            "Binbook ini sangat cocok untuk menjadi buku catatan kuliah atau sekolah karena lebih mudah dan praktis untuk dibawa.",
                    "https://i.ibb.co/fCtY6cD/deenary-id-65945488-567200033684637-2847620819783672716-n.jpg"},
            {"Binbook A5 - Bird",
                    "Rp 35.000",
                    "Binbook (Binder Notebook) adalah notebook yang memiliki ring binder sebagai penjepitnya. \n" +
                            "Bentuknya seperti notebook pada umumnya, namun notebook yang satu ini bisa diisi ulang seperti binder.\n" +
                            "\n" +
                            "\n" +
                            "Ukuran : A5 (20 Ring)\n" +
                            "150mm x 210mm (15cm x 21cm)\n" +
                            "\n" +
                            "DETAIL PRODUK\n" +
                            "- 1 buah ring binder untuk menjepit kertas binder\n" +
                            "- 2 lembar pp pattern cover\n" +
                            "- 2 lembar cover depan belakang (gambar random, tapi jangan cemas karena gambarnya lucu-lucu ^^)\n" +
                            "- 2 lembar pembatas binder polos putih\n" +
                            "- 50 lembar kertas isi binder putih bergaris\n" +
                            "\n" +
                            "Binbook ini sangat cocok untuk menjadi buku catatan kuliah atau sekolah karena lebih mudah dan praktis untuk dibawa.",
                    "https://i.ibb.co/zJ3W2hM/deenary-id-65191816-128840625000251-292012979976410159-n.jpg"},
            {"Binbook A5 - Fire",
                    "Rp 35.000",
                    "Binbook (Binder Notebook) adalah notebook yang memiliki ring binder sebagai penjepitnya. \n" +
                            "Bentuknya seperti notebook pada umumnya, namun notebook yang satu ini bisa diisi ulang seperti binder.\n" +
                            "\n" +
                            "\n" +
                            "Ukuran : A5 (20 Ring)\n" +
                            "150mm x 210mm (15cm x 21cm)\n" +
                            "\n" +
                            "DETAIL PRODUK\n" +
                            "- 1 buah ring binder untuk menjepit kertas binder\n" +
                            "- 2 lembar pp pattern cover\n" +
                            "- 2 lembar cover depan belakang (gambar random, tapi jangan cemas karena gambarnya lucu-lucu ^^)\n" +
                            "- 2 lembar pembatas binder polos putih\n" +
                            "- 50 lembar kertas isi binder putih bergaris\n" +
                            "\n" +
                            "Binbook ini sangat cocok untuk menjadi buku catatan kuliah atau sekolah karena lebih mudah dan praktis untuk dibawa.",
                    "https://i.ibb.co/ByNd1gn/deenary-id-64782842-705897663187117-6465950978758796153-n.jpg"},
            {"Binbook A5 - Earth",
                    "Rp 35.000",
                    "Binbook (Binder Notebook) adalah notebook yang memiliki ring binder sebagai penjepitnya. \n" +
                            "Bentuknya seperti notebook pada umumnya, namun notebook yang satu ini bisa diisi ulang seperti binder.\n" +
                            "\n" +
                            "\n" +
                            "Ukuran : A5 (20 Ring)\n" +
                            "150mm x 210mm (15cm x 21cm)\n" +
                            "\n" +
                            "DETAIL PRODUK\n" +
                            "- 1 buah ring binder untuk menjepit kertas binder\n" +
                            "- 2 lembar pp pattern cover\n" +
                            "- 2 lembar cover depan belakang (gambar random, tapi jangan cemas karena gambarnya lucu-lucu ^^)\n" +
                            "- 2 lembar pembatas binder polos putih\n" +
                            "- 50 lembar kertas isi binder putih bergaris\n" +
                            "\n" +
                            "Binbook ini sangat cocok untuk menjadi buku catatan kuliah atau sekolah karena lebih mudah dan praktis untuk dibawa.",
                    "https://i.ibb.co/cr1xPyG/deenary-id-65843711-691309581309063-2704682043787022697-n.jpg"},
            {"Binbook B5 - Swing",
                    "Rp 45.000",
                    "Binbook (Binder Notebook) adalah notebook yang memiliki ring binder sebagai penjepitnya. \n" +
                            "Bentuknya seperti notebook pada umumnya, namun notebook yang satu ini bisa diisi ulang seperti binder.\n" +
                            "\n" +
                            "\n" +
                            "Ukuran : B5 (26 Ring)\n" +
                            "182mm x 257mm (18.2cm x 25.7cm)\n" +
                            "\n" +
                            "DETAIL PRODUK\n" +
                            "- 1 buah ring binder untuk menjepit kertas binder\n" +
                            "- 2 lembar pp pattern cover\n" +
                            "- 2 lembar cover depan belakang (gambar random, tapi jangan cemas karena gambarnya lucu-lucu ^^)\n" +
                            "- 2 lembar pembatas binder polos putih\n" +
                            "- 50 lembar kertas isi binder putih bergaris\n" +
                            "\n" +
                            "Binbook ini sangat cocok untuk menjadi buku catatan kuliah atau sekolah karena lebih mudah dan praktis untuk dibawa.",
                    "https://i.ibb.co/kXfHVTy/deenary-id-65091347-152417059262423-4995859895674113813-n.jpg"},
            {"Binbook B5 - Naturally",
                    "Rp 45.000",
                    "Binbook (Binder Notebook) adalah notebook yang memiliki ring binder sebagai penjepitnya. \n" +
                            "Bentuknya seperti notebook pada umumnya, namun notebook yang satu ini bisa diisi ulang seperti binder.\n" +
                            "\n" +
                            "\n" +
                            "Ukuran : B5 (26 Ring)\n" +
                            "182mm x 257mm (18.2cm x 25.7cm)\n" +
                            "\n" +
                            "DETAIL PRODUK\n" +
                            "- 1 buah ring binder untuk menjepit kertas binder\n" +
                            "- 2 lembar pp pattern cover\n" +
                            "- 2 lembar cover depan belakang (gambar random, tapi jangan cemas karena gambarnya lucu-lucu ^^)\n" +
                            "- 2 lembar pembatas binder polos putih\n" +
                            "- 50 lembar kertas isi binder putih bergaris\n" +
                            "\n" +
                            "Binbook ini sangat cocok untuk menjadi buku catatan kuliah atau sekolah karena lebih mudah dan praktis untuk dibawa.",
                    "https://i.ibb.co/1mtrQj8/deenary-id-66619695-409219513275211-1114128780217916506-n.jpg"},
            {"Loose Leaf Dot A5",
                    "Rp 15.000",
                    "LOOSE LEAF BY DEENARY\n" +
                            "Bisa digunakan untuk isi kertas binder atau binbook (binder notebook) deenary\n" +
                            "\n" +
                            "\n" +
                            "DETAIL PRODUK :\n" +
                            "- Ukuran A5 (15 cm x 21 cm)\n" +
                            "- 50 Lembar\n" +
                            "- 20 Holes\n" +
                            "- Kertas HVS putih 80gsm\n" +
                            "\n" +
                            "Keunggulan :\n" +
                            "- Kertas ramah lingkungan\n" +
                            "- Kertas tebal dan halus\n" +
                            "- Holes rapi\n" +
                            "- Extra White",
                    "https://i.ibb.co/VL67VWP/deenary-id-59410993-597706260721056-6384073277940828391-n.jpg"},
            {"Loose Leaf Grid A5",
                    "Rp 15.000",
                    "LOOSE LEAF BY DEENARY\n" +
                            "Bisa digunakan untuk isi kertas binder atau binbook (binder notebook) deenary\n" +
                            "\n" +
                            "\n" +
                            "DETAIL PRODUK :\n" +
                            "- Ukuran A5 (15 cm x 21 cm)\n" +
                            "- 50 Lembar\n" +
                            "- 20 Holes\n" +
                            "- Kertas HVS putih 80gsm\n" +
                            "\n" +
                            "Keunggulan :\n" +
                            "- Kertas ramah lingkungan\n" +
                            "- Kertas tebal dan halus\n" +
                            "- Holes rapi\n" +
                            "- Extra White",
                    "https://i.ibb.co/dgFJ9K9/deenary-id-60660678-674789919658362-3660998292260166491-n.jpg"},
            {"Loose Leaf Grid B5",
                    "Rp 20.000",
                    "LOOSE LEAF BY DEENARY\n" +
                            "Bisa digunakan untuk isi kertas binder atau binbook (binder notebook) deenary\n" +
                            "\n" +
                            "\n" +
                            "DETAIL PRODUK :\n" +
                            "- Ukuran B5\n" +
                            "- 50 Lembar\n" +
                            "- 26 Holes\n" +
                            "- Kertas HVS putih 80gsm\n" +
                            "\n" +
                            "Keunggulan :\n" +
                            "- Kertas ramah lingkungan\n" +
                            "- Kertas tebal dan halus\n" +
                            "- Holes rapi\n" +
                            "- Extra White",
                    "https://i.ibb.co/dgFJ9K9/deenary-id-60660678-674789919658362-3660998292260166491-n.jpg"},
            {"Loose Leaf Dot B5",
                    "Rp 20.000",
                    "LOOSE LEAF BY DEENARY\n" +
                            "Bisa digunakan untuk isi kertas binder atau binbook (binder notebook) deenary\n" +
                            "\n" +
                            "\n" +
                            "DETAIL PRODUK :\n" +
                            "- Ukuran B5\n" +
                            "- 50 Lembar\n" +
                            "- 26 Holes\n" +
                            "- Kertas HVS putih 80gsm\n" +
                            "\n" +
                            "Keunggulan :\n" +
                            "- Kertas ramah lingkungan\n" +
                            "- Kertas tebal dan halus\n" +
                            "- Holes rapi\n" +
                            "- Extra White",
                    "https://i.ibb.co/VL67VWP/deenary-id-59410993-597706260721056-6384073277940828391-n.jpg"}
    };

    public static ArrayList<Item> getListData() {
        ArrayList<Item> list = new ArrayList<>();
        for (String[] aData : data) {
            Item item = new Item();
            item.setNameItem(aData[0]);
            item.setPrice(aData[1]);
            item.setDesc(aData[2]);
            item.setPhoto(aData[3]);

            list.add(item);
        }
        return list;
    }
}
