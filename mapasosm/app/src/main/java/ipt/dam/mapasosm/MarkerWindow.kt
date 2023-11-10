package ipt.dam.mapasosm

import android.widget.Button
import android.widget.Toast
import org.osmdroid.views.MapView
import org.osmdroid.views.overlay.infowindow.InfoWindow

class MarkerWindow: InfoWindow {
    private lateinit var parent: MainActivity
    constructor(mapView: MapView, parent: MainActivity):super(R.layout.info_window, mapView) {
        this.parent = parent
    }
    override fun onOpen(item: Any?) {
        closeAllInfoWindowsOn(mapView)

        val olaButton = mView.findViewById<Button>(R.id.ola_button)
        olaButton.setOnClickListener {
            Toast.makeText(parent,"Ola IPT", Toast.LENGTH_LONG).show()
        }

        mView.setOnClickListener {
            close()
        }
    }

    override fun onClose() {
        // para usar caso seja necessário
    }
}
