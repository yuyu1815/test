/*   */ package ai.grazie.model.cloud.ip;
/*   */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\022\020\000\032\n \002*\004\030\0010\0010\001*\0020\003¨\006\004"}, d2 = {"toInetAddress", "Ljava/net/InetAddress;", "kotlin.jvm.PlatformType", "Lai/grazie/model/cloud/ip/IPAddress;", "model-cloud"})
/*   */ public final class ExtensionsKt {
/*   */   public static final InetAddress toInetAddress(@NotNull IPAddress $this$toInetAddress) {
/* 5 */     Intrinsics.checkNotNullParameter($this$toInetAddress, "<this>"); return InetAddress.getByAddress($this$toInetAddress.getBytes());
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\ip\ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */