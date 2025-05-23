/*     */ package ai.grazie.client.common.cloud;
/*     */ 
/*     */ import ai.grazie.client.common.model.RequestOptions;
/*     */ import ai.grazie.model.cloud.API;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\022\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\003¨\006\004"}, d2 = {"withTimeout", "Lai/grazie/client/common/model/RequestOptions;", "api", "Lai/grazie/model/cloud/API;", "client-common"})
/*     */ public final class SuspendableCloudClientKt
/*     */ {
/*     */   @NotNull
/*     */   public static final RequestOptions withTimeout(@NotNull RequestOptions $this$withTimeout, @NotNull API api) {
/* 113 */     Intrinsics.checkNotNullParameter($this$withTimeout, "<this>"); Intrinsics.checkNotNullParameter(api, "api"); return (api.getTimeoutConfig() != null) ? 
/* 114 */       new RequestOptions($this$withTimeout.getHeaders(), $this$withTimeout.getQueryParameters(), api.getTimeoutConfig()) : 
/* 115 */       $this$withTimeout;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\cloud\SuspendableCloudClientKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */