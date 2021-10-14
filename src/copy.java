public static void copy(File src, File dest) throws IllegalAccessException, IOException {
        /*此处用来判断文件是否存在*/if (src.exists() && dest.exists()) {
        /*此处用来判断文件是否是文件类型*/	if (src.isFile() && dest.isFile()) {
        /*此处用来声明需要copy的文件*/FileInputStream input = new FileInputStream(src);
        /*此处用来声明需要copy到的文件*/	FileOutputStream out = new FileOutputStream(dest,false);
        /*此处用来定义一个缓冲区存放读取的文件*/	byte buf[]=new byte[8*1024];
        int b;
			/*此处用来判断文件是否读完，注意点
            (b=input.read(buf,0,buf.length))!=-1：表示读取到buf缓冲区，从文件的0号位开始读取，最多只能暂存buf.length个字节
            */	while((b=input.read(buf,0,buf.length))!=-1) {
        /*此处用来将缓冲区的内容写入到out对应的文件*/	out.write(buf, 0, b);
        out.flush();//最好加上
        //关闭(close)输出流时，应先刷新(flush)换冲的输出流，话句话说就是：“迫使所有缓冲的输出数据被写出到底层输出流中”。
        }
        input.close();
        out.close();
        } else {
        throw new IllegalArgumentException("有一个或者多个文件文件是文件夹");
        }
        } else {
        throw new IllegalArgumentException("有一个或者多个文件文件不存在");
        }

        }

