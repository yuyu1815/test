/*    */ package ai.grazie.client.ktor;
/*    */ 
/*    */ import ai.grazie.utils.http.PlatformHttpClient;
/*    */ import ai.grazie.utils.http.UtilsKt;
/*    */ import io.ktor.client.HttpClientConfig;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\f\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J/\020\017\032\0020\0042\b\b\002\020\020\032\0020\0212\035\b\002\020\022\032\027\022\b\022\006\022\002\b\0030\024\022\004\022\0020\0250\023¢\006\002\b\026R\033\020\003\032\0020\0048FX\002¢\006\f\n\004\b\007\020\b\032\004\b\005\020\006R\033\020\t\032\0020\0048FX\002¢\006\f\n\004\b\013\020\b\032\004\b\n\020\006R\033\020\f\032\0020\0048FX\002¢\006\f\n\004\b\016\020\b\032\004\b\r\020\006¨\006\027"}, d2 = {"Lai/grazie/client/ktor/GrazieKtorHTTPClient$Client;", "", "()V", "Default", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "getDefault", "()Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "Default$delegate", "Lkotlin/Lazy;", "WithExtendedTimeout", "getWithExtendedTimeout", "WithExtendedTimeout$delegate", "WithOneMinuteTimeout", "getWithOneMinuteTimeout", "WithOneMinuteTimeout$delegate", "default", "prefix", "", "config", "Lkotlin/Function1;", "Lio/ktor/client/HttpClientConfig;", "", "Lkotlin/ExtensionFunctionType;", "client-ktor"})
/*    */ public final class Client
/*    */ {
/*    */   @NotNull
/* 43 */   public static final Client INSTANCE = new Client(); @NotNull private static final Lazy Default$delegate = LazyKt.lazy(GrazieKtorHTTPClient$Client$Default$2.INSTANCE); @NotNull public final GrazieKtorHTTPClient getDefault() { Lazy lazy = Default$delegate; return (GrazieKtorHTTPClient)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "invoke"}) static final class GrazieKtorHTTPClient$Client$Default$2 extends Lambda implements Function0<GrazieKtorHTTPClient> { public static final GrazieKtorHTTPClient$Client$Default$2 INSTANCE = new GrazieKtorHTTPClient$Client$Default$2(); public final GrazieKtorHTTPClient invoke() { return new GrazieKtorHTTPClient(PlatformHttpClient.client$default(PlatformHttpClient.INSTANCE, "Default", null, 2, null), null, 2, null); } GrazieKtorHTTPClient$Client$Default$2() { super(0); } }
/* 44 */    @NotNull private static final Lazy WithExtendedTimeout$delegate = LazyKt.lazy(GrazieKtorHTTPClient$Client$WithExtendedTimeout$2.INSTANCE); @NotNull public final GrazieKtorHTTPClient getWithExtendedTimeout() { Lazy lazy = WithExtendedTimeout$delegate; return (GrazieKtorHTTPClient)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "invoke"}) static final class GrazieKtorHTTPClient$Client$WithExtendedTimeout$2 extends Lambda implements Function0<GrazieKtorHTTPClient> { public static final GrazieKtorHTTPClient$Client$WithExtendedTimeout$2 INSTANCE = new GrazieKtorHTTPClient$Client$WithExtendedTimeout$2(); GrazieKtorHTTPClient$Client$WithExtendedTimeout$2() { super(0); } public final GrazieKtorHTTPClient invoke() { return new GrazieKtorHTTPClient(UtilsKt.withExtendedTimeout$default(PlatformHttpClient.client$default(PlatformHttpClient.INSTANCE, "WithExtendedTimeout", null, 2, null), 0L, 0L, 0L, 7, null), null, 2, null); } } @NotNull
/* 45 */   private static final Lazy WithOneMinuteTimeout$delegate = LazyKt.lazy(GrazieKtorHTTPClient$Client$WithOneMinuteTimeout$2.INSTANCE); @NotNull public final GrazieKtorHTTPClient getWithOneMinuteTimeout() { Lazy lazy = WithOneMinuteTimeout$delegate; return (GrazieKtorHTTPClient)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "invoke"}) static final class GrazieKtorHTTPClient$Client$WithOneMinuteTimeout$2 extends Lambda implements Function0<GrazieKtorHTTPClient> { public static final GrazieKtorHTTPClient$Client$WithOneMinuteTimeout$2 INSTANCE = new GrazieKtorHTTPClient$Client$WithOneMinuteTimeout$2(); GrazieKtorHTTPClient$Client$WithOneMinuteTimeout$2() { super(0); } public final GrazieKtorHTTPClient invoke() { return new GrazieKtorHTTPClient(UtilsKt.withOneMinuteTimeout(PlatformHttpClient.client$default(PlatformHttpClient.INSTANCE, "WithOneMinuteTimeout", null, 2, null)), null, 2, null); } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\006\022\002\b\0030\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/HttpClientConfig;", "invoke"})
/*    */   static final class GrazieKtorHTTPClient$Client$default$4 extends Lambda implements Function1<HttpClientConfig<?>, Unit> { public static final GrazieKtorHTTPClient$Client$default$4 INSTANCE = new GrazieKtorHTTPClient$Client$default$4(); GrazieKtorHTTPClient$Client$default$4() { super(1); }
/* 47 */     public final void invoke(HttpClientConfig $this$null) { Intrinsics.checkNotNullParameter($this$null, "$this$null"); } } @NotNull
/* 48 */   public final GrazieKtorHTTPClient default(@NotNull String prefix, @NotNull Function1 config) { Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(config, "config"); return new GrazieKtorHTTPClient(PlatformHttpClient.INSTANCE.client(prefix, config), null, 2, null); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-ktor-jvm-0.4.32.jar!\ai\grazie\client\ktor\GrazieKtorHTTPClient$Client.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */