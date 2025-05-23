/*    */ package ai.grazie.api.gateway.client;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lai/grazie/api/gateway/client/PlatformConfigurationUrl$Production;", "", "()V", "CHINA", "Lai/grazie/api/gateway/client/PlatformConfigurationUrl;", "getCHINA", "()Lai/grazie/api/gateway/client/PlatformConfigurationUrl;", "GLOBAL", "getGLOBAL", "api-gateway-client"})
/*    */ public final class Production
/*    */ {
/*    */   @NotNull
/* 61 */   public static final Production INSTANCE = new Production(); @NotNull private static final PlatformConfigurationUrl GLOBAL = new PlatformConfigurationUrl("https://www.jetbrains.com"); @NotNull public final PlatformConfigurationUrl getGLOBAL() { return GLOBAL; } @NotNull
/* 62 */   private static final PlatformConfigurationUrl CHINA = new PlatformConfigurationUrl("https://www.jetbrains.com.cn"); @NotNull public final PlatformConfigurationUrl getCHINA() { return CHINA; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\PlatformConfigurationUrl$Production.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */