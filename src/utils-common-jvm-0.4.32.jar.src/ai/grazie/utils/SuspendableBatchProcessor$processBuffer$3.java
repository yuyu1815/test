/*     */ package ai.grazie.utils;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\b\003\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "T", "Result", "invoke"})
/*     */ final class SuspendableBatchProcessor$processBuffer$3
/*     */   extends Lambda
/*     */   implements Function0<String>
/*     */ {
/*     */   SuspendableBatchProcessor$processBuffer$3(Ref.ObjectRef<SuspendableBatchProcessor.Buffer<T, Result>> $currentBatch) {
/*     */     super(0);
/*     */   }
/*     */   
/*     */   public final String invoke() {
/* 101 */     return "Processing buffer " + ((SuspendableBatchProcessor.Buffer)this.$currentBatch.element).getId().getText() + " of size " + ((SuspendableBatchProcessor.Buffer)this.$currentBatch.element).getCount();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\SuspendableBatchProcessor$processBuffer$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */