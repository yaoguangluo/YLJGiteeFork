/*
 * @(#)TransmitWizard.java	1.6 02/08/21
 *
 * Copyright (c) 1996-2002 Sun Microsystems, Inc.  All rights reserved.
 */

package jmapps.jmstudio;

import java.util.*;

import java.awt.*;
import javax.media.*;
import javax.media.protocol.*;
import javax.media.rtp.*;




import com.sun.media.util.JMFI18N;

import jmapps.util.JMAppsCfg;
import jmapps.export.ExportWizard;
import jmapps.export.PanelMediaTargetType;


@SuppressWarnings("serial")
public class TransmitWizard extends ExportWizard {

    @SuppressWarnings("rawtypes")
	private Vector      vectorMngrSessions = null;
    @SuppressWarnings("rawtypes")
	private Vector      vectorStreams = null;
    @SuppressWarnings("rawtypes")
	private Vector      vectorStreamLabels = null;
    

    public TransmitWizard ( Frame frame, String strSourceUrl,
			    DataSource dataSource,
			    JMAppsCfg cfgJMApps ) {
    	super ( JMFI18N.getResource("jmstudio.transmit.title"), frame, strSourceUrl, cfgJMApps );

        String    arrAllowContType [];

        strTargetType = PanelMediaTargetType.TYPE_NETWORK;

	panelSource.setDataSource(dataSource);

	arrAllowContType = new String [1];
        arrAllowContType[0] = ContentDescriptor.mimeTypeToPackageName ( ContentDescriptor.RAW_RTP );
        panelTargetFormat.setAllowContentType ( arrAllowContType );

        if ( strSourceUrl != null  &&  strSourceUrl.trim().length() > 0 ) {
            frameOwner.setCursor ( new Cursor(Cursor.WAIT_CURSOR) );
            setNextPage ();
            frameOwner.setCursor ( Cursor.getDefaultCursor() );
        }
    }

    public Processor getProcessor () {
        return ( this.processor );
    }

    @SuppressWarnings("rawtypes")
	public Vector getMngrSessions () {
        return ( vectorMngrSessions );
    }

    @SuppressWarnings("rawtypes")
	public Vector getStreams () {
        return ( vectorStreams );
    }

    @SuppressWarnings("rawtypes")
	public Vector getStreamLabels () {
        return ( vectorStreamLabels );
    }

    protected Panel getFirstPage () {
    	return ( panelSource );
    }

    protected Panel getLastPage () {
    	return ( panelTargetNetwork );
    }

    @SuppressWarnings("unused")
	protected Panel getNextPage ( Panel panelPage ) {
    	Panel	panelPageNext = null;
    	String	strTargetType;

    	if ( panelPage == null ) {
    	    panelPageNext = getFirstPage ();
    	}
    	else if ( panelPage == panelSource ) {
    	    panelPageNext = panelTargetFormat;
    	}
    	else if ( panelPage == panelTargetFormat ) {
            panelPageNext = panelTargetNetwork;
    	}
    	else {
    	    panelPageNext = null;
    	}

    	return ( panelPageNext );
    }

    protected Panel getPrevPage ( Panel panelPage ) {
    	Panel	panelPagePrev = null;

    	if ( panelPage == null )
    	    panelPagePrev = getLastPage ();
    	else if ( panelPage == panelTargetNetwork )
    	    panelPagePrev = panelTargetFormat;
    	else if ( panelPage == panelTargetFormat ) {
    	    panelPagePrev = panelSource;
	    processor.close();
	    processor = null;
	    panelSource.setDataSource(null);
    	 } else
    	    panelPagePrev = null;

    	return ( panelPagePrev );
    }

    @SuppressWarnings("rawtypes")
	protected void createTransmitWindow () {
        vectorMngrSessions = new Vector ();
        vectorStreams = new Vector ();
        vectorStreamLabels = new Vector ();
    }

    @SuppressWarnings({ "unchecked", "deprecation" })
	protected void addTransmitSessionManager ( SessionManager mngrSession,
                        SendStream streamSend, String strStreamLabel ) {

        if ( vectorMngrSessions != null )
            vectorMngrSessions.addElement ( mngrSession );
        if ( vectorStreams != null )
            vectorStreams.addElement ( streamSend );
        if ( vectorStreamLabels != null )
            vectorStreamLabels.addElement ( strStreamLabel );
    }


}


