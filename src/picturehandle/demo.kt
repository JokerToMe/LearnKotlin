package picturehandle

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main(args: Array<String>) {
    var image = BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB)
    var w = 0..99
    var h = 0..99
    image.apply {
        for (i in w){
            for (j in h){
                setRGB(i,j,0x0000ff)
            }
        }
    }
    ImageIO.write(image,"bmp", File("a.bmp"))
}