/*    */ package ai.grazie.ner.suspendable;
/*    */ 
/*    */ import ai.grazie.nlp.tokenizer.word.StandardWordTokenizer;
/*    */ import ai.grazie.utils.mpp.time.Duration;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020 \n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J>\020\003\032\0020\0042\006\020\005\032\0020\0042\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\032\b\002\020\n\032\024\022\n\022\b\022\004\022\0020\r0\f\022\004\022\0020\0070\013¨\006\016"}, d2 = {"Lai/grazie/ner/suspendable/BatchableNERAnnotationService$Companion;", "", "()V", "withBatching", "Lai/grazie/ner/suspendable/SuspendableNERAnnotationService;", "service", "buffer", "", "bufferTimeout", "Lai/grazie/utils/mpp/time/Duration;", "counter", "Lkotlin/Function1;", "", "", "model-ner"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\b\n\000\n\002\020 \n\002\020\016\n\002\b\002\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\003H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "parameters", "", "", "invoke", "(Ljava/util/List;)Ljava/lang/Integer;"})
/*    */   @SourceDebugExtension({"SMAP\nBatchableNERAnnotationService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatchableNERAnnotationService.kt\nai/grazie/ner/suspendable/BatchableNERAnnotationService$Companion$withBatching$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
/*    */   static final class BatchableNERAnnotationService$Companion$withBatching$1
/*    */     extends Lambda
/*    */     implements Function1<List<? extends String>, Integer>
/*    */   {
/*    */     public static final BatchableNERAnnotationService$Companion$withBatching$1 INSTANCE = new BatchableNERAnnotationService$Companion$withBatching$1();
/*    */     
/*    */     BatchableNERAnnotationService$Companion$withBatching$1() {
/*    */       super(1);
/*    */     }
/*    */     
/*    */     public final Integer invoke(List parameters) {
/* 32 */       Intrinsics.checkNotNullParameter(parameters, "parameters"); List list = parameters; int i = 0; for (String str1 : list) { String str2 = str1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 39 */         int j = i, $i$a$-sumOfInt-BatchableNERAnnotationService$Companion$withBatching$1$1 = 0;
/*    */         int k = StandardWordTokenizer.INSTANCE.words(str2).size();
/*    */         i = j + k; }
/*    */       
/*    */       return Integer.valueOf(i);
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SuspendableNERAnnotationService withBatching(@NotNull SuspendableNERAnnotationService service, int buffer, @NotNull Duration bufferTimeout, @NotNull Function1<? super List<String>, Integer> counter) {
/*    */     Intrinsics.checkNotNullParameter(service, "service");
/*    */     Intrinsics.checkNotNullParameter(bufferTimeout, "bufferTimeout");
/*    */     Intrinsics.checkNotNullParameter(counter, "counter");
/*    */     return new BatchableNERAnnotationService(service, buffer, counter, bufferTimeout);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ner-jvm-0.4.32.jar!\ai\grazie\ner\suspendable\BatchableNERAnnotationService$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */