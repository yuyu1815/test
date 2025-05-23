/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import ai.grazie.utils.mpp.LoggerFactory;
/*    */ import ai.grazie.utils.mpp.MPPLogger;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\005\030\0002\0020\001B\005¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\016¢\006\016\n\000\032\004\b\006\020\007\"\004\b\b\020\tR\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017¨\006\020"}, d2 = {"Lai/grazie/utils/http/ResponseHeadersLoggerPluginConfig;", "", "()V", "headerNames", "", "", "getHeaderNames", "()Ljava/util/List;", "setHeaderNames", "(Ljava/util/List;)V", "logger", "Lai/grazie/utils/mpp/MPPLogger;", "getLogger", "()Lai/grazie/utils/mpp/MPPLogger;", "setLogger", "(Lai/grazie/utils/mpp/MPPLogger;)V", "utils-ktor"})
/*    */ public final class ResponseHeadersLoggerPluginConfig
/*    */ {
/*    */   @NotNull
/* 79 */   private List<String> headerNames = CollectionsKt.emptyList(); @NotNull public final List<String> getHeaderNames() { return this.headerNames; } public final void setHeaderNames(@NotNull List<String> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.headerNames = <set-?>; } @NotNull
/* 80 */   private MPPLogger logger = LoggerFactory.INSTANCE.create("ai.grazie.cloud.client.ResponseHeadersLogger"); @NotNull public final MPPLogger getLogger() { return this.logger; } public final void setLogger(@NotNull MPPLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.logger = <set-?>; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\ResponseHeadersLoggerPluginConfig.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */