/*    */ package ai.grazie.model.cloud.ip;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\020\022\n\002\b\003\n\002\020\016\n\002\b\004\bf\030\000 \n2\0020\001:\001\nR\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tø\001\000\002\006\n\004\b!0\001¨\006\013À\006\001"}, d2 = {"Lai/grazie/model/cloud/ip/IPAddress;", "", "bytes", "", "getBytes", "()[B", "display", "", "getDisplay", "()Ljava/lang/String;", "Companion", "model-cloud"})
/*    */ public interface IPAddress {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @NotNull
/*    */   byte[] getBytes();
/*    */   
/*    */   @NotNull
/*    */   String getDisplay();
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\020\020\007\032\004\030\0010\0042\006\020\005\032\0020\006¨\006\b"}, d2 = {"Lai/grazie/model/cloud/ip/IPAddress$Companion;", "", "()V", "parse", "Lai/grazie/model/cloud/ip/IPAddress;", "ip", "", "parseOrNull", "model-cloud"})
/*    */   public static final class Companion {
/*    */     @NotNull
/*    */     public final IPAddress parse(@NotNull String ip) {
/* 22 */       Intrinsics.checkNotNullParameter(ip, "ip"); IPv4Address.Companion.parseOrNull(ip); return (IPv4Address.Companion.parseOrNull(ip) != null) ? IPv4Address.Companion.parseOrNull(ip) : IPv6Address.Companion.parse(ip);
/*    */     }
/*    */     @Nullable
/*    */     public final IPAddress parseOrNull(@NotNull String ip) {
/* 26 */       Intrinsics.checkNotNullParameter(ip, "ip"); IPv4Address.Companion.parseOrNull(ip); return (IPv4Address.Companion.parseOrNull(ip) != null) ? IPv4Address.Companion.parseOrNull(ip) : IPv6Address.Companion.parseOrNull(ip);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\ip\IPAddress.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */