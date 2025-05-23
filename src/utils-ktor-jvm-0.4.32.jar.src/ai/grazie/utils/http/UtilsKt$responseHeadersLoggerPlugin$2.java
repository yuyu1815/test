/*     */ package ai.grazie.utils.http;
/*     */ 
/*     */ import ai.grazie.utils.mpp.MPPLogger;
/*     */ import io.ktor.client.plugins.api.ClientPluginBuilder;
/*     */ import io.ktor.client.plugins.api.OnResponseContext;
/*     */ import io.ktor.client.statement.HttpResponse;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/api/ClientPluginBuilder;", "Lai/grazie/utils/http/ResponseHeadersLoggerPluginConfig;", "invoke"})
/*     */ final class UtilsKt$responseHeadersLoggerPlugin$2
/*     */   extends Lambda
/*     */   implements Function1<ClientPluginBuilder<ResponseHeadersLoggerPluginConfig>, Unit>
/*     */ {
/*     */   public static final UtilsKt$responseHeadersLoggerPlugin$2 INSTANCE = new UtilsKt$responseHeadersLoggerPlugin$2();
/*     */   
/*     */   public final void invoke(ClientPluginBuilder $this$createClientPlugin) {
/*  59 */     Intrinsics.checkNotNullParameter($this$createClientPlugin, "$this$createClientPlugin"); List<String> headerNames = ((ResponseHeadersLoggerPluginConfig)$this$createClientPlugin.getPluginConfig()).getHeaderNames();
/*  60 */     if (headerNames.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/*  64 */     MPPLogger logger = ((ResponseHeadersLoggerPluginConfig)$this$createClientPlugin.getPluginConfig()).getLogger();
/*     */     
/*  66 */     $this$createClientPlugin.onResponse(new Function3<OnResponseContext, HttpResponse, Continuation<? super Unit>, Object>(headerNames, logger, null) { public final Object invokeSuspend(Object $result) { HttpResponse response; String message; Iterable<String> $this$filter$iv; Iterable $this$map$iv; int $i$f$filter, $i$f$map; Iterable<String> iterable1; Iterable $this$filterTo$iv$iv; Collection<Object> collection; Collection<Pair> destination$iv$iv; int $i$f$filterTo, $i$f$mapTo; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); response = (HttpResponse)this.L$0;
/*  67 */                 $this$filter$iv = this.$headerNames;
/*  68 */                 $i$f$filter = 0;
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
/* 122 */                 iterable1 = $this$filter$iv; collection = new ArrayList(); $i$f$filterTo = 0;
/* 123 */                 for (String element$iv$iv : iterable1) { String it = element$iv$iv; int $i$a$-filter-UtilsKt$responseHeadersLoggerPlugin$2$1$message$1 = 0; if (response.getHeaders().contains(it)) collection.add(element$iv$iv);  }
/* 124 */                  $this$map$iv = collection; $i$f$map = 0;
/* 125 */                 $this$filterTo$iv$iv = $this$map$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); $i$f$mapTo = 0;
/* 126 */                 for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 127 */                   String str = (String)item$iv$iv; Collection<Pair> collection1 = destination$iv$iv; int $i$a$-map-UtilsKt$responseHeadersLoggerPlugin$2$1$message$2 = 0; collection1.add(TuplesKt.to(str, response.getHeaders().get(str)));
/* 128 */                 }  message = CollectionsKt.joinToString$default(destination$iv$iv, null, null, null, 0, null, UtilsKt$responseHeadersLoggerPlugin$2$1$message$3.INSTANCE, 31, null);
/*     */                 if (!StringsKt.isBlank(message))
/*     */                   this.$logger.info(new Function0<String>(message) {
/*     */                         public final String invoke() {
/*     */                           return this.$message;
/*     */                         }
/*     */                       }); 
/*     */                 return Unit.INSTANCE; }
/*     */             
/*     */             throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */           
/*     */           int label;
/*     */           
/*     */           public final Object invoke(OnResponseContext p1, HttpResponse p2, Continuation<? super null> p3) {
/*     */             Function3<OnResponseContext, HttpResponse, Continuation<? super Unit>, Object> function3 = new Function3<>(this.$headerNames, this.$logger, p3);
/*     */             function3.L$0 = p2;
/*     */             return function3.invokeSuspend(Unit.INSTANCE);
/*     */           }
/*     */           
/*     */           @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\r\n\000\n\002\030\002\n\002\020\016\n\000\020\000\032\0020\0012\024\020\002\032\020\022\004\022\0020\004\022\006\022\004\030\0010\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "invoke"})
/*     */           static final class UtilsKt$responseHeadersLoggerPlugin$2$1$message$3 extends Lambda implements Function1<Pair<? extends String, ? extends String>, CharSequence> {
/*     */             public static final UtilsKt$responseHeadersLoggerPlugin$2$1$message$3 INSTANCE = new UtilsKt$responseHeadersLoggerPlugin$2$1$message$3();
/*     */             
/*     */             UtilsKt$responseHeadersLoggerPlugin$2$1$message$3() {
/*     */               super(1);
/*     */             }
/*     */             
/*     */             public final CharSequence invoke(Pair it) {
/*     */               Intrinsics.checkNotNullParameter(it, "it");
/*     */               return "" + it.getFirst() + " = " + it.getFirst();
/*     */             }
/*     */           } }
/*     */       );
/*     */   }
/*     */   
/*     */   UtilsKt$responseHeadersLoggerPlugin$2() {
/*     */     super(1);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\UtilsKt$responseHeadersLoggerPlugin$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */