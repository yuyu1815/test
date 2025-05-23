/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\b\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\033\020\003\032\0020\0048FX\002¢\006\f\n\004\b\007\020\b\032\004\b\005\020\006R\033\020\t\032\0020\0048FX\002¢\006\f\n\004\b\013\020\b\032\004\b\n\020\006¨\006\f"}, d2 = {"Lai/grazie/utils/http/KtorWebSocketClient$Client;", "", "()V", "Default", "Lai/grazie/utils/http/KtorWebSocketClient;", "getDefault", "()Lai/grazie/utils/http/KtorWebSocketClient;", "Default$delegate", "Lkotlin/Lazy;", "WithExtendedTimeout", "getWithExtendedTimeout", "WithExtendedTimeout$delegate", "utils-ktor"})
/*    */ public final class Client
/*    */ {
/*    */   @NotNull
/* 15 */   public static final Client INSTANCE = new Client(); @NotNull private static final Lazy Default$delegate = LazyKt.lazy(KtorWebSocketClient$Client$Default$2.INSTANCE); @NotNull public final KtorWebSocketClient getDefault() { Lazy lazy = Default$delegate; return (KtorWebSocketClient)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/utils/http/KtorWebSocketClient;", "invoke"}) static final class KtorWebSocketClient$Client$Default$2 extends Lambda implements Function0<KtorWebSocketClient> { public static final KtorWebSocketClient$Client$Default$2 INSTANCE = new KtorWebSocketClient$Client$Default$2(); public final KtorWebSocketClient invoke() { return KtorWebSocketClient.Companion.default(PlatformWebSocketClient.INSTANCE.get()); } KtorWebSocketClient$Client$Default$2() { super(0); } }
/* 16 */    @NotNull private static final Lazy WithExtendedTimeout$delegate = LazyKt.lazy(KtorWebSocketClient$Client$WithExtendedTimeout$2.INSTANCE); @NotNull public final KtorWebSocketClient getWithExtendedTimeout() { Lazy lazy = WithExtendedTimeout$delegate; return (KtorWebSocketClient)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/utils/http/KtorWebSocketClient;", "invoke"}) static final class KtorWebSocketClient$Client$WithExtendedTimeout$2 extends Lambda implements Function0<KtorWebSocketClient> { public static final KtorWebSocketClient$Client$WithExtendedTimeout$2 INSTANCE = new KtorWebSocketClient$Client$WithExtendedTimeout$2(); KtorWebSocketClient$Client$WithExtendedTimeout$2() { super(0); } public final KtorWebSocketClient invoke() { return KtorWebSocketClient.Companion.withExtendedTimeout(PlatformWebSocketClient.INSTANCE.get()); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\KtorWebSocketClient$Client.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */