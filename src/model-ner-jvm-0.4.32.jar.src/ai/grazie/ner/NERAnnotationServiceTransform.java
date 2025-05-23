/*    */ package ai.grazie.ner;
/*    */ import ai.grazie.ner.model.SentenceWithNERAnnotations;
/*    */ import ai.grazie.ner.suspendable.SuspendableMultiNERAnnotationService;
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import java.util.List;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\007J\030\020\003\032\0020\0072\006\020\005\032\0020\0062\006\020\b\032\0020\tH\007J \020\003\032\0020\0072\006\020\005\032\0020\0062\006\020\b\032\0020\t2\006\020\n\032\0020\013H\007J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\n\032\0020\013H\007J\020\020\003\032\0020\0072\006\020\005\032\0020\fH\007J\030\020\003\032\0020\0072\006\020\005\032\0020\f2\006\020\n\032\0020\013H\007J\030\020\003\032\0020\0072\006\020\b\032\0020\t2\006\020\005\032\0020\006H\007J \020\003\032\0020\0072\006\020\b\032\0020\t2\006\020\005\032\0020\0062\006\020\n\032\0020\013H\007¨\006\r"}, d2 = {"Lai/grazie/ner/NERAnnotationServiceTransform;", "", "()V", "blocking", "Lai/grazie/ner/blocking/BlockingMultiNERAnnotationService;", "service", "Lai/grazie/ner/suspendable/SuspendableMultiNERAnnotationService;", "Lai/grazie/ner/blocking/BlockingNERAnnotationService;", "language", "Lai/grazie/nlp/langs/Language;", "context", "Lkotlin/coroutines/CoroutineContext;", "Lai/grazie/ner/suspendable/SuspendableNERAnnotationService;", "model-ner"})
/*    */ public final class NERAnnotationServiceTransform {
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   public static final BlockingMultiNERAnnotationService blocking(@NotNull SuspendableMultiNERAnnotationService service) {
/* 17 */     Intrinsics.checkNotNullParameter(service, "service"); return blocking(service, (CoroutineContext)Dispatchers.getDefault());
/*    */   } @NotNull
/*    */   public static final NERAnnotationServiceTransform INSTANCE = new NERAnnotationServiceTransform(); @JvmStatic
/*    */   @NotNull
/*    */   public static final BlockingMultiNERAnnotationService blocking(@NotNull SuspendableMultiNERAnnotationService service, @NotNull CoroutineContext context) {
/* 22 */     Intrinsics.checkNotNullParameter(service, "service"); Intrinsics.checkNotNullParameter(context, "context"); return new NERAnnotationServiceTransform$blocking$1(context, service); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J$\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\0062\f\020\007\032\b\022\004\022\0020\b0\003H\026¨\006\t"}, d2 = {"ai/grazie/ner/NERAnnotationServiceTransform$blocking$1", "Lai/grazie/ner/blocking/BlockingMultiNERAnnotationService;", "annotate", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "language", "Lai/grazie/nlp/langs/Language;", "sentences", "", "model-ner"})
/*    */   public static final class NERAnnotationServiceTransform$blocking$1 implements BlockingMultiNERAnnotationService { NERAnnotationServiceTransform$blocking$1(CoroutineContext $context, SuspendableMultiNERAnnotationService $service) {}
/* 24 */     public List<SentenceWithNERAnnotations> annotate(Language language, List<String> sentences) { Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(sentences, "sentences"); return (List<SentenceWithNERAnnotations>)BuildersKt.runBlocking(this.$context, new NERAnnotationServiceTransform$blocking$1$annotate$1(this.$service, language, sentences, null)); } @DebugMetadata(f = "NERAnnotationServiceTransform.kt", l = {24}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.ner.NERAnnotationServiceTransform$blocking$1$annotate$1") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "Lkotlinx/coroutines/CoroutineScope;"}) static final class NERAnnotationServiceTransform$blocking$1$annotate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SentenceWithNERAnnotations>>, Object> { int label; NERAnnotationServiceTransform$blocking$1$annotate$1(SuspendableMultiNERAnnotationService $service, Language $language, List<String> $sentences, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$service.annotate(this.$language, this.$sentences, (Continuation)this) == object) ? object : this.$service.annotate(this.$language, this.$sentences, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super NERAnnotationServiceTransform$blocking$1$annotate$1> $completion) {
/*    */         return (Continuation<Unit>)new NERAnnotationServiceTransform$blocking$1$annotate$1(this.$service, this.$language, this.$sentences, $completion);
/*    */       } public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */         return ((NERAnnotationServiceTransform$blocking$1$annotate$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */       } } } @JvmStatic
/*    */   @NotNull
/*    */   public static final BlockingNERAnnotationService blocking(@NotNull SuspendableNERAnnotationService service) {
/* 31 */     Intrinsics.checkNotNullParameter(service, "service"); return blocking(service, (CoroutineContext)Dispatchers.getDefault());
/*    */   }
/*    */   
/*    */   @JvmStatic
/*    */   @NotNull
/* 36 */   public static final BlockingNERAnnotationService blocking(@NotNull SuspendableNERAnnotationService service, @NotNull CoroutineContext context) { Intrinsics.checkNotNullParameter(service, "service"); Intrinsics.checkNotNullParameter(context, "context"); return new NERAnnotationServiceTransform$blocking$2(context, service); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/ner/NERAnnotationServiceTransform$blocking$2", "Lai/grazie/ner/blocking/BlockingNERAnnotationService;", "annotate", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "sentences", "", "model-ner"})
/*    */   public static final class NERAnnotationServiceTransform$blocking$2 implements BlockingNERAnnotationService { NERAnnotationServiceTransform$blocking$2(CoroutineContext $context, SuspendableNERAnnotationService $service) {}
/* 38 */     public List<SentenceWithNERAnnotations> annotate(List<String> sentences) { Intrinsics.checkNotNullParameter(sentences, "sentences"); return (List<SentenceWithNERAnnotations>)BuildersKt.runBlocking(this.$context, new NERAnnotationServiceTransform$blocking$2$annotate$1(this.$service, sentences, null)); } @DebugMetadata(f = "NERAnnotationServiceTransform.kt", l = {38}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.ner.NERAnnotationServiceTransform$blocking$2$annotate$1") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "Lkotlinx/coroutines/CoroutineScope;"}) static final class NERAnnotationServiceTransform$blocking$2$annotate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SentenceWithNERAnnotations>>, Object> { int label; NERAnnotationServiceTransform$blocking$2$annotate$1(SuspendableNERAnnotationService $service, List<String> $sentences, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$service.annotate(this.$sentences, (Continuation)this) == object) ? object : this.$service.annotate(this.$sentences, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */        public final Continuation<Unit> create(Object value, Continuation<? super NERAnnotationServiceTransform$blocking$2$annotate$1> $completion) {
/*    */         return (Continuation<Unit>)new NERAnnotationServiceTransform$blocking$2$annotate$1(this.$service, this.$sentences, $completion);
/*    */       } public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */         return ((NERAnnotationServiceTransform$blocking$2$annotate$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */       } } }
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   public static final BlockingNERAnnotationService blocking(@NotNull Language language, @NotNull SuspendableMultiNERAnnotationService service) {
/* 47 */     Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(service, "service"); return blocking(language, service, (CoroutineContext)Dispatchers.getDefault());
/*    */   }
/*    */   
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   public static final BlockingNERAnnotationService blocking(@NotNull Language language, @NotNull SuspendableMultiNERAnnotationService service, @NotNull CoroutineContext context)
/*    */   {
/* 54 */     Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(service, "service"); Intrinsics.checkNotNullParameter(context, "context"); return new NERAnnotationServiceTransform$blocking$3(context, service, language);
/*    */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/ner/NERAnnotationServiceTransform$blocking$3", "Lai/grazie/ner/blocking/BlockingNERAnnotationService;", "annotate", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "sentences", "", "model-ner"})
/* 56 */   public static final class NERAnnotationServiceTransform$blocking$3 implements BlockingNERAnnotationService { NERAnnotationServiceTransform$blocking$3(CoroutineContext $context, SuspendableMultiNERAnnotationService $service, Language $language) {} public List<SentenceWithNERAnnotations> annotate(List<String> sentences) { Intrinsics.checkNotNullParameter(sentences, "sentences"); return (List<SentenceWithNERAnnotations>)BuildersKt.runBlocking(this.$context, new NERAnnotationServiceTransform$blocking$3$annotate$1(this.$service, this.$language, sentences, null)); } @DebugMetadata(f = "NERAnnotationServiceTransform.kt", l = {56}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.ner.NERAnnotationServiceTransform$blocking$3$annotate$1") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "Lkotlinx/coroutines/CoroutineScope;"}) static final class NERAnnotationServiceTransform$blocking$3$annotate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SentenceWithNERAnnotations>>, Object> { int label; NERAnnotationServiceTransform$blocking$3$annotate$1(SuspendableMultiNERAnnotationService $service, Language $language, List<String> $sentences, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$service.annotate(this.$language, this.$sentences, (Continuation)this) == object) ? object : this.$service.annotate(this.$language, this.$sentences, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */        public final Continuation<Unit> create(Object value, Continuation<? super NERAnnotationServiceTransform$blocking$3$annotate$1> $completion) {
/*    */         return (Continuation<Unit>)new NERAnnotationServiceTransform$blocking$3$annotate$1(this.$service, this.$language, this.$sentences, $completion);
/*    */       } public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */         return ((NERAnnotationServiceTransform$blocking$3$annotate$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */       } } }
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   public static final BlockingNERAnnotationService blocking(@NotNull SuspendableMultiNERAnnotationService service, @NotNull Language language) {
/* 65 */     Intrinsics.checkNotNullParameter(service, "service"); Intrinsics.checkNotNullParameter(language, "language"); return blocking(service, language, (CoroutineContext)Dispatchers.getDefault());
/*    */   }
/*    */   
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   public static final BlockingNERAnnotationService blocking(@NotNull SuspendableMultiNERAnnotationService service, @NotNull Language language, @NotNull CoroutineContext context)
/*    */   {
/* 72 */     Intrinsics.checkNotNullParameter(service, "service"); Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(context, "context"); return new NERAnnotationServiceTransform$blocking$4(context, service, language);
/*    */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/ner/NERAnnotationServiceTransform$blocking$4", "Lai/grazie/ner/blocking/BlockingNERAnnotationService;", "annotate", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "sentences", "", "model-ner"})
/* 74 */   public static final class NERAnnotationServiceTransform$blocking$4 implements BlockingNERAnnotationService { NERAnnotationServiceTransform$blocking$4(CoroutineContext $context, SuspendableMultiNERAnnotationService $service, Language $language) {} public List<SentenceWithNERAnnotations> annotate(List<String> sentences) { Intrinsics.checkNotNullParameter(sentences, "sentences"); return (List<SentenceWithNERAnnotations>)BuildersKt.runBlocking(this.$context, new NERAnnotationServiceTransform$blocking$4$annotate$1(this.$service, this.$language, sentences, null)); } @DebugMetadata(f = "NERAnnotationServiceTransform.kt", l = {74}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.ner.NERAnnotationServiceTransform$blocking$4$annotate$1") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "Lkotlinx/coroutines/CoroutineScope;"}) static final class NERAnnotationServiceTransform$blocking$4$annotate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SentenceWithNERAnnotations>>, Object> { int label; NERAnnotationServiceTransform$blocking$4$annotate$1(SuspendableMultiNERAnnotationService $service, Language $language, List<String> $sentences, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$service.annotate(this.$language, this.$sentences, (Continuation)this) == object) ? object : this.$service.annotate(this.$language, this.$sentences, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */       
/*    */       public final Continuation<Unit> create(Object value, Continuation<? super NERAnnotationServiceTransform$blocking$4$annotate$1> $completion) {
/*    */         return (Continuation<Unit>)new NERAnnotationServiceTransform$blocking$4$annotate$1(this.$service, this.$language, this.$sentences, $completion);
/*    */       }
/*    */       
/*    */       public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */         return ((NERAnnotationServiceTransform$blocking$4$annotate$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */       } }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ner-jvm-0.4.32.jar!\ai\grazie\ner\NERAnnotationServiceTransform.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */