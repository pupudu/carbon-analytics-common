

/**
 * DashboardAdminService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v11  Built on : Nov 25, 2014 (03:48:14 IST)
 */

    package org.wso2.carbon.analytics.dashboard.stub;

    /*
     *  DashboardAdminService java interface
     */

    public interface DashboardAdminService {
          

        /**
          * Auto generated method signature
          * 
                    * @param getRecords27
                
         */

         
                     public org.wso2.carbon.analytics.dashboard.stub.data.Table getRecords(

                        java.lang.String tableName28,long timeFrom29,long timeTo30,int startIndex31,int recordCount32,java.lang.String searchQuery33)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getRecords27
            
          */
        public void startgetRecords(

            java.lang.String tableName28,long timeFrom29,long timeTo30,int startIndex31,int recordCount32,java.lang.String searchQuery33,

            final org.wso2.carbon.analytics.dashboard.stub.DashboardAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getDashboards36
                
         */

         
                     public org.wso2.carbon.analytics.dashboard.stub.data.Dashboard[] getDashboards(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getDashboards36
            
          */
        public void startgetDashboards(

            

            final org.wso2.carbon.analytics.dashboard.stub.DashboardAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param deleteDataView39
                
         */

         
                     public boolean deleteDataView(

                        java.lang.String dataViewID40)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param deleteDataView39
            
          */
        public void startdeleteDataView(

            java.lang.String dataViewID40,

            final org.wso2.carbon.analytics.dashboard.stub.DashboardAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param addDataView43
                
         */

         
                     public boolean addDataView(

                        org.wso2.carbon.analytics.dashboard.stub.data.DataView dataView44)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param addDataView43
            
          */
        public void startaddDataView(

            org.wso2.carbon.analytics.dashboard.stub.data.DataView dataView44,

            final org.wso2.carbon.analytics.dashboard.stub.DashboardAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updateWidgetInDashboard47
                
         */

         
                     public boolean updateWidgetInDashboard(

                        java.lang.String dashboardID48,org.wso2.carbon.analytics.dashboard.stub.data.WidgetMetaData widget49)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updateWidgetInDashboard47
            
          */
        public void startupdateWidgetInDashboard(

            java.lang.String dashboardID48,org.wso2.carbon.analytics.dashboard.stub.data.WidgetMetaData widget49,

            final org.wso2.carbon.analytics.dashboard.stub.DashboardAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updateDashboard52
                
         */

         
                     public boolean updateDashboard(

                        org.wso2.carbon.analytics.dashboard.stub.data.Dashboard dashboard53)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updateDashboard52
            
          */
        public void startupdateDashboard(

            org.wso2.carbon.analytics.dashboard.stub.data.Dashboard dashboard53,

            final org.wso2.carbon.analytics.dashboard.stub.DashboardAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getDashboard56
                
         */

         
                     public org.wso2.carbon.analytics.dashboard.stub.data.Dashboard getDashboard(

                        java.lang.String dashboardID57)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getDashboard56
            
          */
        public void startgetDashboard(

            java.lang.String dashboardID57,

            final org.wso2.carbon.analytics.dashboard.stub.DashboardAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getWidgets60
                
         */

         
                     public org.wso2.carbon.analytics.dashboard.stub.data.Widget[] getWidgets(

                        java.lang.String dataViewID61)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getWidgets60
            
          */
        public void startgetWidgets(

            java.lang.String dataViewID61,

            final org.wso2.carbon.analytics.dashboard.stub.DashboardAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updateWidget64
                
         */

         
                     public boolean updateWidget(

                        java.lang.String dataViewID65,org.wso2.carbon.analytics.dashboard.stub.data.Widget widget66)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updateWidget64
            
          */
        public void startupdateWidget(

            java.lang.String dataViewID65,org.wso2.carbon.analytics.dashboard.stub.data.Widget widget66,

            final org.wso2.carbon.analytics.dashboard.stub.DashboardAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updateDataView69
                
         */

         
                     public boolean updateDataView(

                        org.wso2.carbon.analytics.dashboard.stub.data.DataView dataView70)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updateDataView69
            
          */
        public void startupdateDataView(

            org.wso2.carbon.analytics.dashboard.stub.data.DataView dataView70,

            final org.wso2.carbon.analytics.dashboard.stub.DashboardAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getDataView73
                
         */

         
                     public org.wso2.carbon.analytics.dashboard.stub.data.DataView getDataView(

                        java.lang.String dataViewID74)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getDataView73
            
          */
        public void startgetDataView(

            java.lang.String dataViewID74,

            final org.wso2.carbon.analytics.dashboard.stub.DashboardAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getWidgetWithDataViewInfo77
                
         */

         
                     public org.wso2.carbon.analytics.dashboard.stub.data.DataView getWidgetWithDataViewInfo(

                        java.lang.String dataViewID78,java.lang.String widgetID79)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getWidgetWithDataViewInfo77
            
          */
        public void startgetWidgetWithDataViewInfo(

            java.lang.String dataViewID78,java.lang.String widgetID79,

            final org.wso2.carbon.analytics.dashboard.stub.DashboardAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param addWidget82
                
         */

         
                     public boolean addWidget(

                        java.lang.String dataViewID83,org.wso2.carbon.analytics.dashboard.stub.data.Widget widget84)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param addWidget82
            
          */
        public void startaddWidget(

            java.lang.String dataViewID83,org.wso2.carbon.analytics.dashboard.stub.data.Widget widget84,

            final org.wso2.carbon.analytics.dashboard.stub.DashboardAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param addDashboard87
                
         */

         
                     public boolean addDashboard(

                        org.wso2.carbon.analytics.dashboard.stub.data.Dashboard dashboard88)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param addDashboard87
            
          */
        public void startaddDashboard(

            org.wso2.carbon.analytics.dashboard.stub.data.Dashboard dashboard88,

            final org.wso2.carbon.analytics.dashboard.stub.DashboardAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getDataViewsInfo91
                
         */

         
                     public org.wso2.carbon.analytics.dashboard.stub.data.DataView[] getDataViewsInfo(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getDataViewsInfo91
            
          */
        public void startgetDataViewsInfo(

            

            final org.wso2.carbon.analytics.dashboard.stub.DashboardAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param addWidgetToDashboard94
                
         */

         
                     public boolean addWidgetToDashboard(

                        java.lang.String dashboardID95,org.wso2.carbon.analytics.dashboard.stub.data.WidgetMetaData widget96)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param addWidgetToDashboard94
            
          */
        public void startaddWidgetToDashboard(

            java.lang.String dashboardID95,org.wso2.carbon.analytics.dashboard.stub.data.WidgetMetaData widget96,

            final org.wso2.carbon.analytics.dashboard.stub.DashboardAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    