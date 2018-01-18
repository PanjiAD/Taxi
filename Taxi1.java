import java.util.*;

class Taxi{

	static void macet(int tujuan){
		
	}
	static void posisikota(int posisi){
		System.out.println("");
		if (posisi == 1) {
			System.out.println("1. Bangil ( 30 Km )");
			System.out.println("2. Grati ( 20 Km )");
			System.out.println("3. Purwodadi( 60 Km)");
		}
		else if (posisi == 2) {			
			System.out.println("1. Pasuruan Kota ( 30 Km )");
			System.out.println("2. Grati ( 50 Km )");
			System.out.println("3. Purwodadi( 74 Km)");
		}
		else if (posisi == 3) {
			System.out.println("1. Pasuruan Kota ( 20 Km )");
			System.out.println("2. Bangil ( 50 Km )");
			System.out.println("3. Purwodadi( 80 Km)");
		}
		
		System.out.println("");
	}

	static int tigapuluh(String nama,String posisi1,String posisi2,String posisi3,String tujuan1,String tujuan2,String tujuan3,float jam,int posisi,int i,int total,int tujuan){
		Scanner scString = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		total = i - 30000;
		System.out.println("Uang Kembalian Anda " + total);
		if (posisi == 1) {
			tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
		}
		else if (posisi == 2) {
			tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
		}
		else if (posisi == 3) {
			tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
		}
		
		System.out.println("Harga Tiket Taxi :\t30000" );
		System.out.println("Harga Kembalian :\t" +total);
		
		return total;
	}

	static int tigadelapan(String nama,String posisi1,String posisi2,String posisi3,String tujuan1,String tujuan2,String tujuan3,float jam,int posisi,int i,int total,int tujuan){
		Scanner scString = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		total = i - 38000;
		System.out.println("Uang Kembalian Anda " + total);
		if (posisi == 1) {
			tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
		}
		else if (posisi == 2) {
			tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
		}
		else if (posisi == 3) {
			tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
		}
		
		System.out.println("Harga Tiket Taxi :\t38000" );
		System.out.println("Harga Kembalian :\t" +total);
		
		return total;
	}
	
	static int tigalima(String nama,String posisi1,String posisi2,String posisi3,String tujuan1,String tujuan2,String tujuan3,float jam,int posisi,int i,int total,int tujuan){
		Scanner scString = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		total = i - 35000;
		System.out.println("Uang Kembalian Anda " + total);
		if (posisi == 1) {
			tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
		}
		else if (posisi == 2) {
			tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
		}
		else if (posisi == 3) {
			tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
		}
		
		System.out.println("Harga Tiket Taxi :\t35000" );
		System.out.println("Harga Kembalian :\t" +total);
		
		return total;
	}

	static void metode(){

		System.out.println();
		System.out.println("\tMetode Pemian");
		System.out.println("1. E-Buy");
		System.out.println("2. Cash");
	}
	static void posisi(){
			System.out.println("");
			System.out.println("1. Pasuruan Kota");
			System.out.println("2. Bangil");
			System.out.println("3. Grati");
			System.out.println("");
	}
											
	static void pemesanan(String code){
		if(code.equals("y")){
			System.out.println("Pemesanan Anda Akan Segera Kami Proses");
		}
		else if(code.equals("t")){
			System.out.println("Silahkan Isi Kembali Data Anda");
		}
		else{
			System.out.println("Error");
		}
	}

	static void tampilP3T1(int tujuan,String nama, String posisi3, String tujuan1,String tujuan2,String tujuan3,float jam, int i){
		System.out.println("");
		System.out.println("Silahkan Verifikasi Kembali Data Anda");
		System.out.println("Nama :\t\t\t" +nama);
		System.out.println("Posisi :\t\t" +posisi3);
		if (tujuan == 1) {
			System.out.println("Tujuan :\t\t" +tujuan1);
		}
		else if (tujuan == 2) {
			System.out.println("Tujuan :\t\t" +tujuan2);
		}
		else {
			System.out.println("Tujuan :\t\t" +tujuan3);
		}
		System.out.println("Jadwal Keberangkatan :\t" +jam);
		System.out.println("Harga Pemian :\t" +i);
	}
	static void tampilP2T1(int tujuan,String nama, String posisi2, String tujuan1,String tujuan2,String tujuan3,float jam, int i){
		System.out.println("");
		System.out.println("Silahkan Verifikasi Kembali Data Anda");
		System.out.println("Nama :\t\t\t" +nama);
		System.out.println("Posisi :\t\t" +posisi2);
		if (tujuan == 1) {
			System.out.println("Tujuan :\t\t" +tujuan1);
		}
		else if (tujuan == 2) {
			System.out.println("Tujuan :\t\t" +tujuan2);
		}
		else {
			System.out.println("Tujuan :\t\t" +tujuan3);
		}
		System.out.println("Jadwal Keberangkatan :\t" +jam);
		System.out.println("Harga Pemian :\t" +i);
	}

	static void tampilP1T1(int tujuan,String nama, String posisi1, String tujuan1,String tujuan2,String tujuan3,float jam, int i){
		System.out.println("");
		System.out.println("Silahkan Verifikasi Kembali Data Anda");
		System.out.println("Nama :\t\t\t" +nama);
		System.out.println("Posisi :\t\t" +posisi1);
		if (tujuan == 1) {
			System.out.println("Tujuan :\t\t" +tujuan1);
		}
		else if (tujuan == 2) {
			System.out.println("Tujuan :\t\t" +tujuan2);
		}
		else {
			System.out.println("Tujuan :\t\t" +tujuan3);
		}
		System.out.println("Jadwal Keberangkatan :\t" +jam);
		System.out.println("Harga Pemian :\t" +i);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		Scanner scString = new Scanner(System.in);
		Scanner scFloat = new Scanner(System.in);

		int tujuan, harga, taxi, posisi,jl,bayar,total,uang,pilih,i;
		String nama,code,posisi1,posisi2,posisi3,tujuan1,tujuan2,tujuan3,jalur,logout,user,password;
		float jam;
		String[][] User = {
			{"panji","adan","wiji","aliyul","amin","adhe","rafif"},
			{"111","112","113","114","115","116","117"}
		};

		total = 0;
		bayar = rn.nextInt(110000 + 1) + 10000;

		for ( i = bayar; i < 110000 ;i++ ) {
			if (i % 1000 == 0) {
				System.out.print(i);
				break;
			}
		}
		boolean status = true,status1 = true;

	 do{

		System.out.println("");
		System.out.print("Masukkan Nama: ");
		nama = scString.nextLine();
		System.out.println("");
		System.out.println("\t\t==Berikut Daftar Perusahaan Taxi Online== ");
		System.out.println("");
		System.out.println("1. Uzer");
		System.out.println("2. Glab");
		System.out.println("");

		System.out.print("Silahkan Pilih (1/2): ");
		taxi = sc.nextInt();

		if(taxi == 1){
			System.out.println("\t -- Selamat Datang Di Uzer -- ");
			System.out.println("");

			posisi();

			System.out.print("Silahkan Masukkan Posisi Anda: ");
			posisi = sc.nextInt();
				if(posisi == 1){

					posisi1 = "Pasuruan Kota";
					posisi2 = "Bangil";
					posisi3 = "Grati";
					System.out.println("");
					System.out.println("\t -- Uzer -- ");
					posisikota(posisi);
					System.out.println("Silahkan Masukkan Tujuan Anda: ");	
					tujuan = sc.nextInt();

					if(tujuan == 1){							//Uzer Posisi Pasuruan Kota Tujuan Bangil
						tujuan1 = "Bangil";
						tujuan2 = "Grati";
						tujuan3 = "Purwodadi";
						System.out.println("");
						System.out.println("\t -- Uzer -- ");
						System.out.println("");
						System.out.println("Masukkan Jam Keberangkatan: ");
						jam = scFloat.nextFloat();
						if(jam > 00.00 && jam < 23.59 ){
						if(jam >= 07.00 && jam <= 10.00 || jam >= 15.00 && jam <= 19.00 ){
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("Pada Jam " + jam + " jl Solehuddin Macet");
							System.out.println("Kami Menyarankan Untuk Memilih Jalur Alternaif");
							System.out.println("");
							System.out.println("jl Panjaitan - jl Gatot Subroto (35 Km)");
							System.out.println("");
							System.out.print("Apakah Anda Setuju dengan Jalur Alternatif yang Kami Sarankan (y/t) : ");
							jalur = scString.nextLine();

							if(jalur.equals("y")){
								System.out.println("Harga = 42000");

								metode();

								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
								
										if(i > 42000){
										total = i - 42000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t42000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();
										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										
									}
									else if(i < 42000){
											total = 42000 - i;
											System.out.println("Uang Anda Kurang " + total);
											System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
									}
			
									else{	
											tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
											System.out.println("Harga Tiket Taxi :\t42000" );
											System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
												code = scString.nextLine();
												pemesanan(code);
												System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
									
								}
								else if (pilih == 2) {
								 System.out.println("Pemesanan Anda Akan Segera Kami Proses");
								 status = false;
								}
								else{
								  System.out.println("Error");
								  status = false;
								}	
							 }
							
							else if(jalur.equals("t")){
								System.out.println("Harga = 35000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
													do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 35000){

										tigalima(nama,posisi1,posisi2,posisi3,tujuan1,tujuan2,tujuan3,jam,posisi,i,total,tujuan);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();
										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 35000){
										total = 35000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t35000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
									
								}
								else if (pilih == 2) {
							 		System.out.println("Pemesanan Anda Akan Segera Kami Proses");
									status = false;					 
								}
							 else{
								System.out.println("Error");
								status = false;
							}
							}
						}
						else{
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("");
							System.out.println("Pada Jam " + jam + " jl Solehuddin Lancar");
							System.out.println("");
							System.out.println("Harga = 35000");
							metode();
							System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
										if(i > 35000){
										tigalima(nama,posisi1,posisi2,posisi3,tujuan1,tujuan2,tujuan3,jam,posisi,i,total,tujuan);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 35000){
										total = 35000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t35000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else{
								System.out.println("Error");
								status = false;
							}
						}
					}
						else{
							System.out.println("Error");
							status = false;   // else milik tujuan
						}
				} 
						
						else if(tujuan == 2){							//Uzer Posisi Pasuruan Kota Tujuan Grati
						tujuan1 = "Bangil";
						tujuan2 = "Grati";
						tujuan3 = "Purwodadi";
						System.out.println("");
						System.out.println("\t -- Uzer -- ");
						System.out.println("");
						System.out.println("Masukkan Jam Keberangkatan: ");
						jam = scFloat.nextFloat();
						if(jam > 00.00 && jam <= 23.59){
						if(jam >= 07.00 && jam <= 10.00 || jam >= 13.00 && jam <= 15.00){
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("Pada Jam " + jam + " jl A.Yani Macet");
							System.out.println("Kami Menyarankan Untuk Memilih Jalur Alternaif");
							System.out.println("");
							System.out.println("jl Ahmad Subarjo - jl Kartini (27 Km)");
							System.out.println("");
							System.out.print("Apakah Anda Setuju dengan Jalur Alternatif yang Kami Sarankan (y/t) : ");
							jalur = scString.nextLine();

							if(jalur.equals("y")){
								System.out.println("Harga = 35000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 35000){
										tigalima(nama,posisi1,posisi2,posisi3,tujuan1,tujuan2,tujuan3,jam,posisi,i,total,tujuan);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 35000){
										total = 35000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t35000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }else{
								System.out.println("Error");
								status = false;
							}
						}
							else if(jalur.equals("t")){
								System.out.println("Harga = 30000");
								System.out.println("Masukkan No Rekening = ");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 30000){
										tigapuluh(nama,posisi1,posisi2,posisi3,tujuan1,tujuan2,tujuan3,jam,posisi,i,total,tujuan);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 		status = true;
										 }
								  }

								  else if(i < 30000){
										total = 30000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t30000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 		status = true;
										 }
										}
								}

								else if (pilih == 2) {
							 		System.out.println("Pemesanan Anda Akan Segera Kami Proses");
									status = false;					 
								}
								else{
									System.out.println("Error");
									status = false;
								}
							}else{
								System.out.println("Error");
								status = false;
							}
						}
						else{
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("");
							System.out.println("Pada Jam " + jam + " jl A.Yani Lancar");
							System.out.println("");
							System.out.println("Harga = 30000");
							metode();
							System.out.println("Masukkan Metode Pemian: ");
							pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 30000){
										tigapuluh(nama,posisi1,posisi2,posisi3,tujuan1,tujuan2,tujuan3,jam,posisi,i,total,tujuan);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 30000){
										total = 30000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t30000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
						}
						}else{
							System.out.println("Error");
							status = false;   // else milik tujuan
						}

						}
						else if(tujuan == 3){							//Uzer Posisi Pasuruan Kota Tujuan Purwodadi
						tujuan1 = "Bangil";
						tujuan2 = "Grati";
						tujuan3 = "Purwodadi";
						System.out.println("");
						System.out.println("\t -- Uzer -- ");
						System.out.println("");
						System.out.println("Masukkan Jam Keberangkatan: ");
						jam = scFloat.nextFloat();
						if(jam > 00.00  && jam <= 23.59){
						if(jam >= 06.00 && jam <= 08.00  || jam >= 12.00 && jam <= 14.00  ){
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("Pada Jam " + jam + " jl Diponegoro Macet");
							System.out.println("Kami Menyarankan Untuk Memilih Jalur Alternaif");
							System.out.println("");
							System.out.println("jl Sukarno - jl Bung Hatta ( 66 Km)");
							System.out.println("");
							System.out.print("Apakah Anda Setuju dengan Jalur Alternatif yang Kami Sarankan (y/t) : ");
							jalur = scString.nextLine();

							if(jalur.equals("y")){
								System.out.println("Harga = 82000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 82000){
										total = i - 82000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t82000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 82000){
										total = 82000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t82000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
						}
							else if(jalur.equals("t")){
								System.out.println("Harga = 70000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
											
											if(i > 70000){
											total = i - 70000;
											System.out.println("Uang Kembalian Anda " + total);
											tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
											System.out.println("Harga Tiket Taxi :\t70000" );
											System.out.println("Harga Kembalian :\t" +total);
											System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
											code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 70000){
										total = 70000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
									else{	
										tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t70000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}			

								}
								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
						}
							else{
								System.out.println("Error");
								status = false;
								}
						}
						else{
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("");
							System.out.println("Pada Jam " + jam + " jl Diponegoro Lancar");
							System.out.println("");
							System.out.println("Harga = 70000");
							metode();
							System.out.println("Masukkan Metode Pemian: ");
							pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 70000){
										total = i - 70000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t70000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 70000){
										total = 70000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t70000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
						}
						}else{
							System.out.println("Error");
							status = false;
						}
						}
					else{
						System.out.println("Error");
						status = false;  // else milik tujuan
					}
					}
					else if(posisi == 2){							//Uzer Posisi Bangil

					posisi1 = "Pasuruan Kota";
					posisi2 = "Bangil";
					posisi3 = "Grati";
					System.out.println("");
					System.out.println("\t -- Uzer -- ");
					posisikota(posisi);
					System.out.println("Silahkan Masukkan Tujuan Anda: ");	
					tujuan = sc.nextInt();

					if(tujuan == 1){							//Uzer Posisi Bangil Tujuan Pasuruan Kota
						tujuan1 = "Pasuruan Kota";
						tujuan2 = "Grati";
						tujuan3 = "Purwodadi";
						System.out.println("");
						System.out.println("\t -- Uzer -- ");
						System.out.println("");
						System.out.println("Masukkan Jam Keberangkatan: ");
						jam = scFloat.nextFloat();
						if(jam > 00.00  && jam <= 23.59){
						if(jam >= 07.00 && jam <= 10.00 || jam >= 15.00 && jam <= 19.00 ){
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("Pada Jam " + jam + " jl Solehuddin Macet");
							System.out.println("Kami Menyarankan Untuk Memilih Jalur Alternaif");
							System.out.println("");
							System.out.println("jl Gatot Subroto - jl Panjaitan (35 Km)");
							System.out.println("");
							System.out.print("Apakah Anda Setuju dengan Jalur Alternatif yang Kami Sarankan (y/t) : ");
							jalur = scString.nextLine();

							if(jalur.equals("y")){
								System.out.println("Harga = 42000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 42000){
										total = i - 42000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t42000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 42000){
										total = 42000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t42000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
							else if(jalur.equals("t")){
								System.out.println("Harga = 35000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 35000){
										tigalima(nama,posisi1,posisi2,posisi3,tujuan1,tujuan2,tujuan3,jam,posisi,i,total,tujuan);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 35000){
										total = 35000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t35000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}

							else{
								System.out.println("Error");
								status = false;
								}
						}
						else{
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("");
							System.out.println("Pada Jam " + jam + " jl Solehuddin Lancar");
							System.out.println("");
							System.out.println("Harga = 35000");
							metode();
							System.out.println("Masukkan Metode Pemian: ");
							pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 35000){
										tigalima(nama,posisi1,posisi2,posisi3,tujuan1,tujuan2,tujuan3,jam,posisi,i,total,tujuan);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 35000){
										total = 35000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t35000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
					}
						else{
							System.out.println("Error");
							status = false;     // else milik tujuan
						}
						}
						else if(tujuan == 2){							//Uzer Posisi Bangil Tujuan Grati
						tujuan1 = "Bangil";
						tujuan2 = "Grati";
						tujuan3 = "Purwodadi";
						System.out.println("");
						System.out.println("\t -- Uzer -- ");
						System.out.println("");
						System.out.println("Masukkan Jam Keberangkatan: ");
						jam = scFloat.nextFloat();
						if(jam > 00.00  && jam <=23.59){
						if(jam >= 07.00 && jam <= 10.00 || jam >= 13.00 && jam <= 15.00){
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("Pada Jam " + jam + " jl A.Yani & jl Solehuddin Macet");
							System.out.println("Kami Menyarankan Untuk Memilih Jalur Alternaif");
							System.out.println("");
							System.out.println("jl Ahmad Subarjo - jl Kartini - jl Panjaitan - jl Gatot Subroto ( 58 Km )");
							System.out.println("");
							System.out.print("Apakah Anda Setuju dengan Jalur Alternatif yang Kami Sarankan (y/t) : ");
							jalur = scString.nextLine();

							if(jalur.equals("y")){
								System.out.println("Harga = 75000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 75000){
										total = i - 75000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t75000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 75000){
										total = 75000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t75000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
							else if(jalur.equals("t")){
								System.out.println("Harga = 63000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 63000){
										total = i - 63000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t63000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 63000){
										total = 63000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t63000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
							else{
								System.out.println("Error");
								status = false;
								}
						}
						else{
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("");
							System.out.println("Pada Jam " + jam + " jl A.Yani & jl Solehuddin Lancar");
							System.out.println("");
							System.out.println("Harga = 63000");
							metode();
							System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 63000){
										total = i - 63000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t63000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 63000){
										total = 63000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t63000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
						}else{
							System.out.println("Error");
							status = false;   // else milik tujuan
						}
						}
						else if(tujuan == 3){							//Uzer Posisi Bangil Tujuan Purwodadi
						tujuan1 = "Bangil";
						tujuan2 = "Grati";
						tujuan3 = "Purwodadi";
						System.out.println("");
						System.out.println("\t -- Uzer -- ");
						System.out.println("");
						System.out.println("Masukkan Jam Keberangkatan: ");
						jam = scFloat.nextFloat();
						if(jam > 00.00  && jam <= 23.59){
						if(jam >= 06.00 && jam <= 08.00  || jam >= 12.00 && jam <= 14.00  ){
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("Pada Jam " + jam + " jl Imam Bonjol Macet");
							System.out.println("Kami Menyarankan Untuk Memilih Jalur Alternaif");
							System.out.println("");
							System.out.println("jl K.Patimura - jl Lautan Api ( 80 Km)");
							System.out.println("");
							System.out.print("Apakah Anda Setuju dengan Jalur Alternatif yang Kami Sarankan (y/t) : ");
							jalur = scString.nextLine();

							if(jalur.equals("y")){
								System.out.println("Harga = 90000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 90000){
										total = i - 90000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t90000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 90000){
										total = 90000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t90000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
							else if(jalur.equals("t")){
								System.out.println("Harga = 80000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 80000){
										total = i - 80000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t80000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 80000){
										total = 80000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t80000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
							else{
								System.out.println("Error");
								status = false;
								}
						}
						else{
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("");
							System.out.println("Pada Jam " + jam + " jl Imam Bonjol Lancar");
							System.out.println("");
							System.out.println("Harga = 80000");
							metode();
							System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();
								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 80000){
										total = i - 80000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t80000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i <80000){
										total = 80000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t80000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
						}
					else{
						System.out.println("Error");
						status = false;
					}
						}else{
							System.out.println("Error");
							status = false;  //else milik tujuan
						}
					}
		else if(posisi == 3){							//Uzer Posisi Grati

					posisi1 = "Pasuruan Kota";
					posisi2 = "Bangil";
					posisi3 = "Grati";
					System.out.println("");
					System.out.println("\t -- Uzer -- ");
					posisikota(posisi);
					System.out.println("Silahkan Masukkan Tujuan Anda: ");	
					tujuan = sc.nextInt();

					 if(tujuan == 1){							//Uzer Posisi Grati Tujuan pasuruan Kota
						tujuan1 = "Pasuruan Kota";
						tujuan2 = "Bangil";
						tujuan3 = "Purwodadi";
						System.out.println("");
						System.out.println("\t -- Uzer -- ");
						System.out.println("");
						System.out.println("Masukkan Jam Keberangkatan: ");
						jam = scFloat.nextFloat();
						if(jam > 00.00 && jam <=23.59){
						if(jam >= 07.00 && jam <= 10.00 || jam >= 13.00 && jam <= 15.00){
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("Pada Jam " + jam + " jl A.Yani Macet");
							System.out.println("Kami Menyarankan Untuk Memilih Jalur Alternaif");
							System.out.println("");
							System.out.println("jl Kartini - jl Ahmad Subarjo (27 Km)");
							System.out.println("");
							System.out.print("Apakah Anda Setuju dengan Jalur Alternatif yang Kami Sarankan (y/t) : ");
							jalur = scString.nextLine();

							if(jalur.equals("y")){
								System.out.println("Harga = 39000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 39000){
										total = i - 39000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t39000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 39000){
										total = 39000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t39000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
							else if(jalur.equals("t")){
								System.out.println("Harga = 30000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 30000){
										tigapuluh(nama,posisi1,posisi2,posisi3,tujuan1,tujuan2,tujuan3,jam,posisi,i,total,tujuan);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 30000){
										total = 30000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t30000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
							else{
								System.out.println("Error");
								status = false;
								}
						}
						else{
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("");
							System.out.println("Pada Jam " + jam + " jl A.Yani Lancar");
							System.out.println("");
							System.out.println("Harga = 30000");
							metode();
							System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 30000){
										tigapuluh(nama,posisi1,posisi2,posisi3,tujuan1,tujuan2,tujuan3,jam,posisi,i,total,tujuan);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 30000){
										total = 30000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t30000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
						}else{
							System.out.println("Error");
							status = false;   // else milik tujuan
						}
						}
						else if(tujuan == 2){							//Uzer Posisi Garti Tujuan Bangil
						tujuan1 = "Pasuruan Kota";
						tujuan2 = "Bangil";
						tujuan3 = "Purwodadi";
						System.out.println("");
						System.out.println("\t -- Uzer -- ");
						System.out.println("");
						System.out.println("Masukkan Jam Keberangkatan: ");
						jam = scFloat.nextFloat();
						if(jam > 00.00  && jam <= 23.59){
						if(jam >= 07.00 && jam <= 10.00 || jam >= 13.00 && jam <= 15.00){
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("Pada Jam " + jam + " jl Solehuddin & jl A.Yani Macet");
							System.out.println("Kami Menyarankan Untuk Memilih Jalur Alternaif");
							System.out.println("");
							System.out.println(" jl Gatot Subroto - jl Panjaitan - jl Kartini - jl Ahmad Subarjo ( 58 Km )");
							System.out.println("");
							System.out.print("Apakah Anda Setuju dengan Jalur Alternatif yang Kami Sarankan (y/t) : ");
							jalur = scString.nextLine();

							if(jalur.equals("y")){
								System.out.println("Harga = 75000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 75000){
										total = i - 75000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t75000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 75000){
										total = 75000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t75000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
							}
							else if(jalur.equals("t")){
								System.out.println("Harga = 63000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 63000){
										total = i - 63000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t63000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 63000){
										total = 63000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t63000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
							else{
								System.out.println("Error");
								status = false;
								}
						}
						else{
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("");
							System.out.println("Pada Jam " + jam + " jl Solehuddin & jl A.Yani Lancar");
							System.out.println("");
							System.out.println("Harga = 63000");
							metode();
							System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 63000){
										total = i - 63000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t63000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 63000){
										total = 63000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t63000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
						}else{
							System.out.println("Error");
							status = false;   // else milik tujuan
						}
						}
						else if(tujuan == 3){							//Uzer Posisi Grati Tujuan Purwodadi
						tujuan1 = "Pasuruan Kota";
						tujuan2 = "Bangil";
						tujuan3 = "Purwodadi";
						System.out.println("");
						System.out.println("\t -- Uzer -- ");
						System.out.println("");
						System.out.println("Masukkan Jam Keberangkatan: ");
						jam = scFloat.nextFloat();
						if(jam > 00.00  && jam <=23.59){
						if(jam >= 06.00 && jam <= 08.00  || jam >= 12.00 && jam <= 14.00  ){
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("Pada Jam " + jam + " jl J.Nasution Macet");
							System.out.println("Kami Menyarankan Untuk Memilih Jalur Alternaif");
							System.out.println("");
							System.out.println("jl Jokowi - jl Benjamin S ( 88 Km)");
							System.out.println("");
							System.out.print("Apakah Anda Setuju dengan Jalur Alternatif yang Kami Sarankan (y/t) : ");
							jalur = scString.nextLine();

							if(jalur.equals("y")){
								System.out.println("Harga = 94000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 94000){
										total = i - 94000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t94000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 94000){
										total = 94000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t94000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
							}
							else if(jalur.equals("t")){
								System.out.println("Harga = 85000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 85000){
										total = i - 85000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t85000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 85000){
										total = 85000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t85000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
							else{
								System.out.println("Error");
								status = false;
								}
						}
						else{
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("");
							System.out.println("Pada Jam " + jam + " jl J.Nasution Lancar");
							System.out.println("");
							System.out.println("Harga = 85000");
							metode();
							System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 85000){
										total = i - 85000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t85000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 85000){
										total = 85000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t85000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
						}else{
							System.out.println("Error");
							status = false;
						}
						}
					else{
						System.out.println("Error");
						status = false;  // else milik tujuan
					}
					
				}else{
					System.out.println("Error");
					status = false;   //else milik posisi
				}
			}
			//------------------------------------------------------------------------------------------------------------------------------------
		else if(taxi == 2){
			System.out.println("\t ** Selamat Datang Di Glab ** ");
			System.out.println("");

			posisi();

			System.out.print("Silahkan Masukkan Posisi Anda: ");
			posisi = sc.nextInt();
				if(posisi == 1){

					posisi1 = "Pasuruan Kota";
					posisi2 = "Bangil";
					posisi3 = "Grati";
					System.out.println("");
					System.out.println("\t ** Glab ** ");
					posisikota(posisi);

					System.out.println("Silahkan Masukkan Tujuan Anda: ");	
					tujuan = sc.nextInt();

					if(tujuan == 1){							//Glab Posisi Pasuruan Kota Tujuan Bangil
						tujuan1 = "Bangil";
						tujuan2 = "Grati";
						tujuan3 = "Purwodadi";
						System.out.println("");
						System.out.println("\t ** Glab ** ");
						System.out.println("");
						System.out.println("Masukkan Jam Keberangkatan: ");
						jam = scFloat.nextFloat();
						if(jam > 00.00 && jam <= 23.59 ){
						if(jam >= 07.00 && jam <= 10.00 || jam >= 15.00 && jam <= 19.00 ){
							System.out.println("");
							System.out.println("\t ** Glab ** ");
							System.out.println("Pada Jam " + jam + " jl Solehuddin Macet");
							System.out.println("Kami Menyarankan Untuk Memilih Jalur Alternaif");
							System.out.println("");
							System.out.println("jl Panjaitan - jl Gatot Subroto (35 Km)");
							System.out.println("");
							System.out.print("Apakah Anda Setuju dengan Jalur Alternatif yang Kami Sarankan (y/t) : ");
							jalur = scString.nextLine();

							if(jalur.equals("y")){
								System.out.println("Harga = 47000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
									do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 47000){
										total = i - 47000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t47000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 47000){
										total = 47000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t47000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
							}
							else if(jalur.equals("t")){
								System.out.println("Harga = 38000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
									do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 38000){
										tigadelapan(nama,posisi1,posisi2,posisi3,tujuan1,tujuan2,tujuan3,jam,posisi,i,total,tujuan);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 38000){
										total = 38000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t38000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
							else{
								System.out.println("Error");
								status = false;
								}
						}
						else{
							System.out.println("");
							System.out.println("\t ** Glab ** ");
							System.out.println("");
							System.out.println("Pada Jam " + jam + " jl Solehuddin Lancar");
							System.out.println("");
							System.out.println("Harga = 38000");
							metode();
							System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
									do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 38000){
										tigadelapan(nama,posisi1,posisi2,posisi3,tujuan1,tujuan2,tujuan3,jam,posisi,i,total,tujuan);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 38000){
										total = 38000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t38000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
							
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
						}
						else{
							System.out.println("Error");
							status = false;    // else milik tujuan
						}
						}
						
						else if(tujuan == 2){							//Glab Posisi Pasuruan Kota Tujuan Grati
						tujuan1 = "Bangil";
						tujuan2 = "Grati";
						tujuan3 = "Purwodadi";
						System.out.println("");
						System.out.println("\t ** Glab ** ");
						System.out.println("");
						System.out.println("Masukkan Jam Keberangkatan: ");
						jam = scFloat.nextFloat();
						if(jam > 00.00 && jam <= 23.59){
						if(jam >= 07.00 && jam <= 10.00 || jam >= 13.00 && jam <= 15.00){
							System.out.println("");
							System.out.println("\t ** Glab ** ");
							System.out.println("Pada Jam " + jam + " jl A.Yani Macet");
							System.out.println("Kami Menyarankan Untuk Memilih Jalur Alternaif");
							System.out.println("");
							System.out.println("jl Ahmad Subarjo - jl Kartini (27 Km)");
							System.out.println("");
							System.out.print("Apakah Anda Setuju dengan Jalur Alternatif yang Kami Sarankan (y/t) : ");
							jalur = scString.nextLine();

							if(jalur.equals("y")){
								System.out.println("Harga = 44000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
									do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 44000){
										total = i - 44000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t44000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 44000){
										total = 44000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t44000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
							}
							else if(jalur.equals("t")){
								System.out.println("Harga = 35000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 35000){
										tigalima(nama,posisi1,posisi2,posisi3,tujuan1,tujuan2,tujuan3,jam,posisi,i,total,tujuan);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 35000){
										total = 35000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t35000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
							else{
								System.out.println("Error");
								status = false;
								}
						}
						else{
							System.out.println("");
							System.out.println("\t ** Glab ** ");
							System.out.println("");
							System.out.println("Pada Jam " + jam + " jl A.Yani Lancar");
							System.out.println("");
							System.out.println("Harga = 35000");
							metode();
							System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 35000){
										tigalima(nama,posisi1,posisi2,posisi3,tujuan1,tujuan2,tujuan3,jam,posisi,i,total,tujuan);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 35000){
										total = 35000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t35000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
						}else{
							System.out.println("Error");
							status = false;   // else milik tujuan
						}

						}
						else if(tujuan == 3){							//Uzer Posisi Pasuruan Kota Tujuan Purwodadi
						tujuan1 = "Bangil";
						tujuan2 = "Grati";
						tujuan3 = "Purwodadi";
						System.out.println("");
						System.out.println("\t ** Glab ** ");
						System.out.println("");
						System.out.println("Masukkan Jam Keberangkatan: ");
						jam = scFloat.nextFloat();
						if(jam > 00.00  && jam <= 23.59){
						if(jam >= 06.00 && jam <= 08.00  || jam >= 12.00 && jam <= 14.00  ){
							System.out.println("");
							System.out.println("\t ** Glab ** ");
							System.out.println("Pada Jam " + jam + " jl Diponegoro Macet");
							System.out.println("Kami Menyarankan Untuk Memilih Jalur Alternaif");
							System.out.println("");
							System.out.println("jl Sukarno - jl Bung Hatta ( 66 Km)");
							System.out.println("");
							System.out.print("Apakah Anda Setuju dengan Jalur Alternatif yang Kami Sarankan (y/t) : ");
							jalur = scString.nextLine();

							if(jalur.equals("y")){
								System.out.println("Harga = 89000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 89000){
										total = i - 89000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t89000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 89000){
										total = 89000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t89000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }						}
							else if(jalur.equals("t")){
								System.out.println("Harga = 77000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 77000){
										total = i - 77000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t77000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 77000){
										total = 77000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t77000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
							else{
								System.out.println("Error");
								status = false;
								}
						}
						else{
							System.out.println("");
							System.out.println("\t ** Glab ** ");
							System.out.println("");
							System.out.println("Pada Jam " + jam + " jl Diponegoro Lancar");
							System.out.println("");
							System.out.println("Harga = 77000");
							metode();
							System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 77000){
										total = i - 77000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t77000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 77000){
										total = 77000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP1T1(tujuan,nama, posisi1,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t77000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
						}else{
							System.out.println("Error");
							status = false;
						}
						}
					else{
						System.out.println("Error");
						status = false; // else milik tujuan
					}
					}
					else if(posisi == 2){							//Glab Posisi Bangil

					posisi1 = "Pasuruan Kota";
					posisi2 = "Bangil";
					posisi3 = "Grati";
					System.out.println("");
					System.out.println("\t ** Glab ** ");
					posisikota(posisi);

					System.out.println("Silahkan Masukkan Tujuan Anda: ");	
					tujuan = sc.nextInt();

					if(tujuan == 1){							//Glab Posisi Bangil Tujuan Pasuruan Kota
						tujuan1 = "Pasuruan Kota";
						tujuan2 = "Grati";
						tujuan3 = "Purwodadi";
						System.out.println("");
						System.out.println("\t ** Glab ** ");
						System.out.println("");
						System.out.println("Masukkan Jam Keberangkatan: ");
						jam = scFloat.nextFloat();
						if(jam > 00.00  && jam <= 23.59){
						if(jam >= 07.00 && jam <= 10.00 || jam >= 15.00 && jam <= 19.00 ){
							System.out.println("");
							System.out.println("\t ** Glab ** ");
							System.out.println("Pada Jam " + jam + " jl Solehuddin Macet");
							System.out.println("Kami Menyarankan Untuk Memilih Jalur Alternaif");
							System.out.println("");
							System.out.println("jl Gatot Subroto - jl Panjaitan (35 Km)");
							System.out.println("");
							System.out.print("Apakah Anda Setuju dengan Jalur Alternatif yang Kami Sarankan (y/t) : ");
							jalur = scString.nextLine();

							if(jalur.equals("y")){
								System.out.println("Harga = 47000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 47000){
										total = i - 47000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t47000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 47000){
										total = 47000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t47000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
							else if(jalur.equals("t")){
								System.out.println("Harga = 38000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 38000){
										tigadelapan(nama,posisi1,posisi2,posisi3,tujuan1,tujuan2,tujuan3,jam,posisi,i,total,tujuan);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 38000){
										total = 38000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t38000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
							else{
								System.out.println("Error");
								status = false;
								}
						}
						else{
							System.out.println("");
							System.out.println("\t ** Glab ** ");
							System.out.println("");
							System.out.println("Pada Jam " + jam + " jl Solehuddin Lancar");
							System.out.println("");
							System.out.println("Harga = 38000");
							metode();
							System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 38000){
										tigadelapan(nama,posisi1,posisi2,posisi3,tujuan1,tujuan2,tujuan3,jam,posisi,i,total,tujuan);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 38000){
										total = 38000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t38000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
					}
						else{
							System.out.println("Error");
							status = false; // else milik tujuan
						}
						}
						else if(tujuan == 2){							//Glab Posisi Bangil Tujuan Grati
						tujuan1 = "Bangil";
						tujuan2 = "Grati";
						tujuan3 = "Purwodadi";
						System.out.println("");
						System.out.println("\t ** Glab ** ");
						System.out.println("");
						System.out.println("Masukkan Jam Keberangkatan: ");
						jam = scFloat.nextFloat();
						if(jam > 00.00  && jam <=23.59){
						if(jam >= 07.00 && jam <= 10.00 || jam >= 13.00 && jam <= 15.00){
							System.out.println("");
							System.out.println("\t ** Glab ** ");
							System.out.println("Pada Jam " + jam + " jl A.Yani & jl Solehuddin Macet");
							System.out.println("Kami Menyarankan Untuk Memilih Jalur Alternaif");
							System.out.println("");
							System.out.println("jl Ahmad Subarjo - jl Kartini - jl Panjaitan - jl Gatot Subroto ( 58 Km )");
							System.out.println("");
							System.out.print("Apakah Anda Setuju dengan Jalur Alternatif yang Kami Sarankan (y/t) : ");
							jalur = scString.nextLine();

							if(jalur.equals("y")){
								System.out.println("Harga = 78000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 78000){
										total = i - 78000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t78000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 78000){
										total = 78000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t78000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
							}
							else if(jalur.equals("t")){
								System.out.println("Harga = 66000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 66000){
										total = i - 66000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t66000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 66000){
										total = 66000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t66000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
							else{
								System.out.println("Error");
								status = false;
								}
						}
						else{
							System.out.println("");
							System.out.println("\t ** Glab ** ");
							System.out.println("");
							System.out.println("Pada Jam " + jam + " jl A.Yani & jl Solehuddin Lancar");
							System.out.println("");
							System.out.println("Harga = 56000");
							metode();
							System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 56000){
										total = i - 56000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t56000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 56000){
										total = 56000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t56000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
						}else{
							System.out.println("Error");
							status = false;   //else milik tujuan
						}
						}
						else if(tujuan == 3){							//Glab Posisi Bangil Tujuan Purwodadi
						tujuan1 = "Bangil";
						tujuan2 = "Grati";
						tujuan3 = "Purwodadi";
						System.out.println("");
						System.out.println("\t ** Glab ** ");
						System.out.println("");
						System.out.println("Masukkan Jam Keberangkatan: ");
						jam = scFloat.nextFloat();
						if(jam > 00.00  && jam <= 23.59){
						if(jam >= 06.00 && jam <= 08.00  || jam >= 12.00 && jam <= 14.00  ){
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("Pada Jam " + jam + " jl Imam Bonjol Macet");
							System.out.println("Kami Menyarankan Untuk Memilih Jalur Alternaif");
							System.out.println("");
							System.out.println("jl K.Patimura - jl Lautan Api ( 80 Km)");
							System.out.println("");
							System.out.print("Apakah Anda Setuju dengan Jalur Alternatif yang Kami Sarankan (y/t) : ");
							jalur = scString.nextLine();

							if(jalur.equals("y")){
								System.out.println("Harga = 98000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 98000){
										total = i - 98000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t47000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 98000){
										total = 98000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t98000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
							else if(jalur.equals("t")){
								System.out.println("Harga = 86000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 86000){
										total = i - 86000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t86000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 86000){
										total = 86000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t86000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 		status = true;
										 }
									}
								
							}
								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 	}
							 	else {
								 	System.out.print("Error");
								 }
						}else{
								System.out.println("Error");
								status = false;
								}
						}
						else{
							System.out.println("");
							System.out.println("\t ** Glab ** ");
							System.out.println("");
							System.out.println("Pada Jam " + jam + " jl Imam Bonjol Lancar");
							System.out.println("");
							System.out.println("Harga = 86000");
							metode();
							System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 86000){
										total = i - 86000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t86000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 86000){
										total = 86000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP2T1(tujuan,nama, posisi2,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t86000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
											 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
							}
								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }
						}
						}
					else{
						System.out.println("Error");
						status = false;
					}
						}else{
							System.out.println("Error");
							status = false; // else milik tujuan
						}
					}
		else if(posisi == 3){							//Glab Posisi Grati

					posisi1 = "Pasuruan Kota";
					posisi2 = "Bangil";
					posisi3 = "Grati";
					System.out.println("");
					System.out.println("\t ** Glab ** ");
					posisikota(posisi);
					System.out.println("Silahkan Masukkan Tujuan Anda: ");	
					tujuan = sc.nextInt();

					 if(tujuan == 1){							//Glab Posisi Grati Tujuan pasuruan Kota
						tujuan1 = "Pasuruan Kota";
						tujuan2 = "Bangil";
						tujuan3 = "Purwodadi";
						System.out.println("");
						System.out.println("\t ** Glab ** ");
						System.out.println("");
						System.out.println("Masukkan Jam Keberangkatan: ");
						jam = scFloat.nextFloat();
						if(jam > 00.00 && jam <=23.59){
						if(jam >= 07.00 && jam <= 10.00 || jam >= 13.00 && jam <= 15.00){
							System.out.println("");
							System.out.println("\t -- Uzer -- ");
							System.out.println("Pada Jam " + jam + " jl A.Yani Macet");
							System.out.println("Kami Menyarankan Untuk Memilih Jalur Alternaif");
							System.out.println("");
							System.out.println("jl Kartini - jl Ahmad Subarjo (27 Km)");
							System.out.println("");
							System.out.print("Apakah Anda Setuju dengan Jalur Alternatif yang Kami Sarankan (y/t) : ");
							jalur = scString.nextLine();

							if(jalur.equals("y")){
								System.out.println("Harga = 44000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 44000){
										total = i - 44000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t44000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 44000){
										total = 44000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t44000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }                                                                                                                                                                              
						}
							else if(jalur.equals("t")){
								System.out.println("Harga = 35000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 35000){
										tigalima(nama,posisi1,posisi2,posisi3,tujuan1,tujuan2,tujuan3,jam,posisi,i,total,tujuan);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 35000){
										total = 35000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t35000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }             
						}
							else{
								System.out.println("Error");
								status = false;
								}
						}
						else{
							System.out.println("");
							System.out.println("\t ** Glab ** ");
							System.out.println("");
							System.out.println("Pada Jam " + jam + " jl A.Yani Lancar");
							System.out.println("");
							System.out.println("Harga = 35000");

							metode();
							System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 35000){
										tigalima(nama,posisi1,posisi2,posisi3,tujuan1,tujuan2,tujuan3,jam,posisi,i,total,tujuan);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 35000){
										total = 35000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t35000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }             
						}
						}else{
							System.out.println("Error");
							status = false;  // else milik tujuan 
						}
						}
						else if(tujuan == 2){							//Glab Posisi Garti Tujuan Bangil
						tujuan1 = "Pasuruan Kota";
						tujuan2 = "Bangil";
						tujuan3 = "Purwodadi";
						System.out.println("");
						System.out.println("\t ** Glab ** ");
						System.out.println("");
						System.out.println("Masukkan Jam Keberangkatan: ");
						jam = scFloat.nextFloat();
						if(jam > 00.00  && jam <= 23.59){
						if(jam >= 07.00 && jam <= 10.00 || jam >= 13.00 && jam <= 15.00){
							System.out.println("");
							System.out.println("\t ** Glab ** ");
							System.out.println("Pada Jam " + jam + " jl Solehuddin & jl A.Yani Macet");
							System.out.println("Kami Menyarankan Untuk Memilih Jalur Alternaif");
							System.out.println("");
							System.out.println(" jl Gatot Subroto - jl Panjaitan - jl Kartini - jl Ahmad Subarjo ( 57 Km )");
							System.out.println("");
							System.out.print("Apakah Anda Setuju dengan Jalur Alternatif yang Kami Sarankan (y/t) : ");
							jalur = scString.nextLine();

							if(jalur.equals("y")){
								System.out.println("Harga = 78000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 78000){
										total = i - 78000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t78000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 78000){
										total = 78000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t78000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }             
						}
							else if(jalur.equals("t")){
								System.out.println("Harga = 66000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 66000){
										total = i - 66000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t66000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 66000){
										total = 66000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t66000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}
								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }             
						}
							else{
								System.out.println("Error");
								status = false;
								}
						}
						else{
							System.out.println("");
							System.out.println("\t ** Glab ** ");
							System.out.println("");
							System.out.println("Pada Jam " + jam + " jl Solehuddin & jl A.Yani Lancar");
							System.out.println("");
							System.out.println("Harga = 66000");
							metode();
							System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 66000){
										total = i - 66000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t66000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 66000){
										total = 66000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t66000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }             
						}
						}else{
							System.out.println("Error");
							status = false;   //else milik tujuan
						}
						}
						else if(tujuan == 3){							//Glab Posisi Grati Tujuan Purwodadi     
						tujuan1 = "Pasuruan Kota";
						tujuan2 = "Bangil";
						tujuan3 = "Purwodadi";
						System.out.println("");
						System.out.println("\t ** Glab ** ");
						System.out.println("");
						System.out.println("Masukkan Jam Keberangkatan: ");
						jam = scFloat.nextFloat();
						if(jam > 00.00  && jam <= 23.59){
						if(jam >= 06.00 && jam <= 08.00  || jam >= 12.00 && jam <= 14.00  ){
							System.out.println("");
							System.out.println("\t ** Glab ** ");
							System.out.println("Pada Jam " + jam + " jl J.Nasution Macet");
							System.out.println("Kami Menyarankan Untuk Memilih Jalur Alternaif");
							System.out.println("");
							System.out.println("jl Jokowi - jl Benjamin S ( 88 Km)");
							System.out.println("");
							System.out.print("Apakah Anda Setuju dengan Jalur Alternatif yang Kami Sarankan (y/t) : ");
							jalur = scString.nextLine();

							if(jalur.equals("y")){
								System.out.println("Harga = 100000");
								metode();
								System.out.println("Masukkan Metode Pemian: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(i > 1000000){
										total = i - 1000000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t1000000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(i < 1000000){
										total = 1000000 - i;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,i);
										System.out.println("Harga Tiket Taxi :\t1000000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }             
							}
							else if(jalur.equals("t")){
								System.out.println("Harga = 89000");
								metode();
								System.out.println("Masukkan Metode Pembayaran: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(bayar > 89000){
										total = bayar - 89000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,bayar);
										System.out.println("Harga Tiket Taxi :\t89000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(bayar < 89000){
										total = 89000 - bayar;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,bayar);
										System.out.println("Harga Tiket Taxi :\t89000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }             
						}
							else{
								System.out.println("Error");
								status = false;
								}
						}
						else{
							System.out.println("");
							System.out.println("\t ** Glab ** ");
							System.out.println("");
							System.out.println("Pada Jam " + jam + " jl J.Nasution Lancar");
							System.out.println("");
							System.out.println("Harga = 89000");
							metode();
							System.out.println("Masukkan Metode Pembayaran: ");
								pilih = sc.nextInt();

								if (pilih == 1) {
																		do{
										System.out.print("Username: ");
										user = scString.nextLine();
										System.out.print(("Password: "));
										password = scString.nextLine();

										for (int j = 0;j < 7 ;j++ ) {
											if (User[0][j].equals(user) && User[1][j].equals(password)) 
											{
												status1 = true;
												break;
											}
											else{
												status1 = false;
											}
										}
										
									}while(!status1);
									
										if(bayar > 89000){
										total = bayar - 89000;
										System.out.println("Uang Kembalian Anda " + total);
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,bayar);
										System.out.println("Harga Tiket Taxi :\t89000" );
										System.out.println("Harga Kembalian :\t" +total);
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

										pemesanan(code);
										System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
								  }

								  else if(bayar < 89000){
										total = 89000 - bayar;
										System.out.println("Uang Anda Kurang " + total);
										System.out.println("Maaf Data Anda Tidak Dapat Kami Proses");
								  }
								
								else{	
										tampilP3T1(tujuan,nama, posisi3,tujuan1,tujuan2,tujuan3,jam,bayar);
										System.out.println("Harga Tiket Taxi :\t89000" );
										System.out.println("Apakah Data Anda Sudah Benar (y/t) = ");
										code = scString.nextLine();

											pemesanan(code);
											System.out.print("LogOut= ");
										 logout = scString.nextLine();

										 if (logout.equals("y")) {
								 			status = false;
										 }
										 else if (logout.equals("t")) {
									 	status = true;
										 }
										}
								
							}

								else if (pilih == 2) {
							 	System.out.println("Pemesanan Anda Akan Segera Kami Proses");
							 	status = false;
							 }
							 else {
							 	System.out.print("Error");
							 }             
						}
						}else{
							System.out.println("Error");
							status = false;
						}
						}
					else{
						System.out.println("Error");
						status = false;  //else milik tujuan
					}

					}else{
						System.out.println("Error");
						status = false;	//else milik poisisi
					}
				}	
				else{
					System.out.println("Error");
					status = false;     //else miliki Taxi Online
				}
				// Logout(logout,status);
		 }
		 while (status == true);
	}
}
									
								

