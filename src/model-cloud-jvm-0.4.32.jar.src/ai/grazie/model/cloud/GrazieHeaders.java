package ai.grazie.model.cloud;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\016\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\004XT¢\006\002\n\000R\016\020\007\032\0020\004XT¢\006\002\n\000R\016\020\b\032\0020\004XT¢\006\002\n\000R\016\020\t\032\0020\004XT¢\006\002\n\000R\016\020\n\032\0020\004XT¢\006\002\n\000R\016\020\013\032\0020\004XT¢\006\002\n\000R\016\020\f\032\0020\004XT¢\006\002\n\000R\016\020\r\032\0020\004XT¢\006\002\n\000R\016\020\016\032\0020\004XT¢\006\002\n\000R\016\020\017\032\0020\004XT¢\006\002\n\000R\016\020\020\032\0020\004XT¢\006\002\n\000R\016\020\021\032\0020\004XT¢\006\002\n\000¨\006\022"}, d2 = {"Lai/grazie/model/cloud/GrazieHeaders;", "", "()V", "AGENT", "", "APPLICATION_USER", "AUTH_TOKEN", "DEPRECATION_INFO", "FORCE_HTTP_ERROR", "ORIGINAL_APPLICATION_TOKEN", "ORIGINAL_SERVICE_TOKEN", "ORIGINAL_USER_COUNTRY", "ORIGINAL_USER_IP", "ORIGINAL_USER_TOKEN", "PROVIDE_DEBUG_INFO", "QUOTA_METADATA", "TASK_TAG", "TRACE_ID", "model-cloud"})
public final class GrazieHeaders {
  @NotNull
  public static final GrazieHeaders INSTANCE = new GrazieHeaders();
  
  @NotNull
  public static final String AUTH_TOKEN = "Grazie-Authenticate-JWT";
  
  @NotNull
  public static final String ORIGINAL_USER_TOKEN = "Grazie-Original-User-JWT";
  
  @NotNull
  public static final String ORIGINAL_APPLICATION_TOKEN = "Grazie-Original-Application-JWT";
  
  @NotNull
  public static final String APPLICATION_USER = "Grazie-Application-User-ID";
  
  @NotNull
  public static final String ORIGINAL_SERVICE_TOKEN = "Grazie-Original-Service-JWT";
  
  @NotNull
  public static final String ORIGINAL_USER_IP = "Grazie-Original-User-IP";
  
  @NotNull
  public static final String ORIGINAL_USER_COUNTRY = "Grazie-Original-User-Country";
  
  @NotNull
  public static final String AGENT = "Grazie-Agent";
  
  @NotNull
  public static final String QUOTA_METADATA = "Grazie-Quota-Metadata";
  
  @NotNull
  public static final String TRACE_ID = "Grazie-Trace-Id";
  
  @NotNull
  public static final String FORCE_HTTP_ERROR = "Grazie-Force-HTTP-Error";
  
  @NotNull
  public static final String DEPRECATION_INFO = "Grazie-Deprecated-Info";
  
  @NotNull
  public static final String PROVIDE_DEBUG_INFO = "Grazie-Provide-Debug-Info";
  
  @NotNull
  public static final String TASK_TAG = "Grazie-Task-Tag";
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\GrazieHeaders.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */