import java.awt.Dimension
import javax.swing.*
import kotlin.system.exitProcess


object Window {
    @JvmStatic
    fun main(args: Array<String>) {
        val frame = JFrame("Fremdsprachen")
        val content = frame.contentPane
        val layout = SpringLayout()
        content.layout = layout

        val choices = arrayOf(
            "CHOICE 1", "CHOICE 2", "CHOICE 3", "CHOICE 4",
            "CHOICE 5", "CHOICE 6")

        frame.isVisible = true
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(300, 300)
        frame.setLocation(430, 100)

        fun createDropDown(padWest: Int, padNorth: Int): JComboBox<String> {
            val dropDown = JComboBox(choices)
            layout.putConstraint(SpringLayout.WEST , dropDown, padWest,SpringLayout.WEST, content)
            layout.putConstraint(SpringLayout.NORTH , dropDown, padNorth,SpringLayout.NORTH, content)
            content.add(dropDown)
            return dropDown
        }

        fun createLabel(padWest: Int, padNorth: Int, text: String): JLabel {
            val label = JLabel(text)
            layout.putConstraint(SpringLayout.WEST , label, padWest,SpringLayout.WEST, content)
            layout.putConstraint(SpringLayout.NORTH , label, padNorth,SpringLayout.NORTH, content)
            content.add(label)
            return label
        }

        fun createSpinner(padWest: Int, padNorth: Int, value: SpinnerModel): JSpinner{
            val spinner = JSpinner(value)
            layout.putConstraint(SpringLayout.WEST , spinner, padWest,SpringLayout.WEST, content)
            layout.putConstraint(SpringLayout.NORTH , spinner, padNorth,SpringLayout.NORTH, content)
            content.add(spinner)
            return spinner
        }

        val panel = JPanel()
        panel.layout = BoxLayout(panel, BoxLayout.Y_AXIS)
        frame.add(panel)

        createLabel(5,1,"Wähle dein Fremdsprachen:")
        createLabel(200,1,"Klasse:")
        createLabel(100,160,"Wahlpflicht:")

        val value: SpinnerModel = SpinnerNumberModel(
            0, 0, 9, 1)
        createSpinner(200,27, value)

        val value2: SpinnerModel = SpinnerNumberModel(
            0, 0, 9, 1)
        createSpinner(200,58,value2)

        val value3: SpinnerModel = SpinnerNumberModel(
            0, 0, 9, 1)
        createSpinner(200,88,value3)

        val value4: SpinnerModel = SpinnerNumberModel(
            0, 0, 9, 1)
        createSpinner(200,119,value4)

        createDropDown(30, 25)
        createDropDown(30,55)
        createDropDown(30,85)
        createDropDown(30,115)
        createDropDown(100,180)
       val cb6 = createDropDown(100,210)
        cb6.isVisible = false

        val btn = JButton("Next")
        content.add(btn)
        layout.putConstraint(SpringLayout.WEST , btn,220,SpringLayout.WEST, content)
        layout.putConstraint(SpringLayout.NORTH , btn,220,SpringLayout.NORTH, content)
        btn.addActionListener { exitProcess(0) }

        val btn2 = JButton("")
        content.add(btn2)
        btn2.preferredSize = Dimension(25, 25)
        layout.putConstraint(SpringLayout.WEST , btn2,50,SpringLayout.WEST, content)
        layout.putConstraint(SpringLayout.NORTH , btn2,212,SpringLayout.NORTH, content)
        btn2.addActionListener { cb6.isVisible = true }

        frame.isVisible = true

    }
}