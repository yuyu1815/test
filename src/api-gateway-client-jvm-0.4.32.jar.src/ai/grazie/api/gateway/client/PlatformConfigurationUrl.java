/*    */ package ai.grazie.api.gateway.client;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\003\b\b\030\0002\0020\001:\001\017B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\001HÖ\003J\t\020\f\032\0020\rHÖ\001J\t\020\016\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\020"}, d2 = {"Lai/grazie/api/gateway/client/PlatformConfigurationUrl;", "", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Production", "api-gateway-client"})
/*    */ public final class PlatformConfigurationUrl
/*    */ {
/*    */   @NotNull
/*    */   private final String url;
/*    */   
/*    */   public PlatformConfigurationUrl(@NotNull String url) {
/* 59 */     this.url = url; } @NotNull public final String component1() { return this.url; } @NotNull public final PlatformConfigurationUrl copy(@NotNull String url) { Intrinsics.checkNotNullParameter(url, "url"); return new PlatformConfigurationUrl(url); } @NotNull public String toString() { return "PlatformConfigurationUrl(url=" + this.url + ")"; } @NotNull public final String getUrl() { return this.url; } public int hashCode() { return this.url.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof PlatformConfigurationUrl)) return false;  PlatformConfigurationUrl platformConfigurationUrl = (PlatformConfigurationUrl)other; return !!Intrinsics.areEqual(this.url, platformConfigurationUrl.url); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lai/grazie/api/gateway/client/PlatformConfigurationUrl$Production;", "", "()V", "CHINA", "Lai/grazie/api/gateway/client/PlatformConfigurationUrl;", "getCHINA", "()Lai/grazie/api/gateway/client/PlatformConfigurationUrl;", "GLOBAL", "getGLOBAL", "api-gateway-client"}) public static final class Production
/*    */   {
/* 61 */     @NotNull public static final Production INSTANCE = new Production(); @NotNull private static final PlatformConfigurationUrl GLOBAL = new PlatformConfigurationUrl("https://www.jetbrains.com"); @NotNull public final PlatformConfigurationUrl getGLOBAL() { return GLOBAL; } @NotNull
/* 62 */     private static final PlatformConfigurationUrl CHINA = new PlatformConfigurationUrl("https://www.jetbrains.com.cn"); @NotNull public final PlatformConfigurationUrl getCHINA() { return CHINA; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\PlatformConfigurationUrl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */