/*
 *    Calendula - An assistant for personal medication management.
 *    Copyright (C) 2016 CITIUS - USC
 *
 *    Calendula is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this software.  If not, see <http://www.gnu.org/licenses/>.
 */

package es.usc.citius.servando.calendula.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.mikepenz.aboutlibraries.LibsBuilder;

import es.usc.citius.servando.calendula.CalendulaActivity;
import es.usc.citius.servando.calendula.R;

public class AboutActivity extends CalendulaActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setupToolbar("About", getResources().getColor(R.color.dark_grey_home));
        setupStatusBar(getResources().getColor(R.color.dark_grey_home));

        if (savedInstanceState == null) {

            Fragment fragment = new LibsBuilder()
                    .withAboutAppName("Calendula")
                    .withAboutIconShown(true)
                    .withAboutVersionShown(true)
                    .withLicenseShown(true)
                    .withLicenseDialog(true)
                    .withAboutDescription("<br/><br/>Calendula está desarrollada por el Centro de Investigación en Tecnologías de la Información " +
                            " de la USC (<a href='http://citius.usc.es'>CITIUS</a>)<br/><br/>Nuestro objetivo " +
                            "es proporcionar a los pacientes y a las personas que se ocupan de ellos las herramientas " +
                            "necesarias para mejorar su nivel de adherencia a la medicación." +
                            "<br/><br/>Si quieres saber más visita nuestra web:" +
                            "<br/> <a href='http://citius.usc.es/calendula'>citius.usc.es/calendula </a>" +
                            "<br/><br/>Calendula es un proyecto de código abierto. Puedes contribuir con tus ideas y sugerencias " +
                            "a través de nuestra página en Github o enviando un mensaje de correo electrónico:" +
                            "<br/><a href='https://github.com/citiususc/calendula'>https://github.com/citiususc/calendula </a>" +
                            "<br/><a href='mailto:citius.calendula@usc.es'>citius.calendula@usc.es</a>" +
                            "<br/><br/>" +
                            "Para este desarrollo hacemos uso de algunas librerías y utilidades de código abierto, que mostramos a continuacion:"

                    )
                    .fragment();

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.fragment_holder, fragment).commit();
        }
    }

}