/*   */ package ai.grazie.model.cloud.ip;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006¨\006\013"}, d2 = {"Lai/grazie/model/cloud/ip/KnownIPAddresses;", "", "()V", "china", "Lai/grazie/model/cloud/ip/IPAddress;", "getChina", "()Lai/grazie/model/cloud/ip/IPAddress;", "local", "getLocal", "usa", "getUsa", "model-cloud"})
/*   */ public final class KnownIPAddresses {
/*   */   @NotNull
/* 7 */   public static final KnownIPAddresses INSTANCE = new KnownIPAddresses(); @NotNull private static final IPAddress local = IPAddress.Companion.parse("127.0.0.1"); @NotNull public final IPAddress getLocal() { return local; } @NotNull
/* 8 */   private static final IPAddress china = IPAddress.Companion.parse("1.0.1.1"); @NotNull public final IPAddress getChina() { return china; } @NotNull
/* 9 */   private static final IPAddress usa = IPAddress.Companion.parse("8.8.8.8"); @NotNull public final IPAddress getUsa() { return usa; }
/*   */ 
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\ip\KnownIPAddresses.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */