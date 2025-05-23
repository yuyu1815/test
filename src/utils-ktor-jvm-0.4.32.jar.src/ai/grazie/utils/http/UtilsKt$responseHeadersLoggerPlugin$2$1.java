/*     */ package ai.grazie.utils.http;
/*     */ 
/*     */ import ai.grazie.utils.mpp.MPPLogger;
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
/*     */ @DebugMetadata(f = "utils.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.UtilsKt$responseHeadersLoggerPlugin$2$1")
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H@"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/api/OnResponseContext;", "response", "Lio/ktor/client/statement/HttpResponse;"})
/*     */ @SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\nai/grazie/utils/http/UtilsKt$responseHeadersLoggerPlugin$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n774#2:122\n865#2,2:123\n1557#2:125\n1628#2,3:126\n*S KotlinDebug\n*F\n+ 1 utils.kt\nai/grazie/utils/http/UtilsKt$responseHeadersLoggerPlugin$2$1\n*L\n68#1:122\n68#1:123,2\n69#1:125\n69#1:126,3\n*E\n"})
/*     */ final class null
/*     */   extends SuspendLambda
/*     */   implements Function3<OnResponseContext, HttpResponse, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   null(List<String> $headerNames, MPPLogger $logger, Continuation $completion) {
/*     */     super(3, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     HttpResponse response;
/*     */     String message;
/*     */     Iterable<String> $this$filter$iv;
/*     */     Iterable $this$map$iv;
/*     */     int $i$f$filter, $i$f$map;
/*     */     Iterable<String> iterable1;
/*     */     Iterable $this$filterTo$iv$iv;
/*     */     Collection<Object> collection;
/*     */     Collection<Pair> destination$iv$iv;
/*     */     int $i$f$filterTo, $i$f$mapTo;
/*  66 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); response = (HttpResponse)this.L$0;
/*  67 */         $this$filter$iv = this.$headerNames;
/*  68 */         $i$f$filter = 0;
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
/* 122 */         iterable1 = $this$filter$iv; collection = new ArrayList(); $i$f$filterTo = 0;
/* 123 */         for (String element$iv$iv : iterable1) { String it = element$iv$iv; int $i$a$-filter-UtilsKt$responseHeadersLoggerPlugin$2$1$message$1 = 0; if (response.getHeaders().contains(it)) collection.add(element$iv$iv);  }
/* 124 */          $this$map$iv = collection; $i$f$map = 0;
/* 125 */         $this$filterTo$iv$iv = $this$map$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); $i$f$mapTo = 0;
/* 126 */         for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 127 */           String str = (String)item$iv$iv; Collection<Pair> collection1 = destination$iv$iv; int $i$a$-map-UtilsKt$responseHeadersLoggerPlugin$2$1$message$2 = 0; collection1.add(TuplesKt.to(str, response.getHeaders().get(str)));
/* 128 */         }  message = CollectionsKt.joinToString$default(destination$iv$iv, null, null, null, 0, null, UtilsKt$responseHeadersLoggerPlugin$2$1$message$3.INSTANCE, 31, null);
/*     */         if (!StringsKt.isBlank(message))
/*     */           this.$logger.info(new Function0<String>(message) {
/*     */                 public final String invoke() {
/*     */                   return this.$message;
/*     */                 }
/*     */               }); 
/*     */         return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Object invoke(OnResponseContext p1, HttpResponse p2, Continuation<? super null> p3) {
/*     */     Object object = new Object(this.$headerNames, this.$logger, p3);
/*     */     object.L$0 = p2;
/*     */     return object.invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\r\n\000\n\002\030\002\n\002\020\016\n\000\020\000\032\0020\0012\024\020\002\032\020\022\004\022\0020\004\022\006\022\004\030\0010\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "invoke"})
/*     */   static final class UtilsKt$responseHeadersLoggerPlugin$2$1$message$3 extends Lambda implements Function1<Pair<? extends String, ? extends String>, CharSequence> {
/*     */     public static final UtilsKt$responseHeadersLoggerPlugin$2$1$message$3 INSTANCE = new UtilsKt$responseHeadersLoggerPlugin$2$1$message$3();
/*     */     
/*     */     UtilsKt$responseHeadersLoggerPlugin$2$1$message$3() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     public final CharSequence invoke(Pair it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return "" + it.getFirst() + " = " + it.getFirst();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\UtilsKt$responseHeadersLoggerPlugin$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */