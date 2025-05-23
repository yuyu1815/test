/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.ProduceStateScope;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.painter.Painter;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Charsets;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineDispatcher;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.compose.resources.ImageDecoders_skikoKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.CircularProgressStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "CircularProgressIndicator.kt", l = {76}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1")
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\002\n\002\030\002\n\002\020 \n\002\030\002\020\000\032\0020\001*\016\022\n\022\b\022\004\022\0020\0040\0030\002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", "", "Landroidx/compose/ui/graphics/painter/Painter;"})
/*     */ final class CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1
/*     */   extends SuspendLambda
/*     */   implements Function2<ProduceStateScope<List<? extends Painter>>, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1(CoroutineDispatcher $dispatcher, Function1<Color, List<String>> $frameRetriever, CircularProgressStyle $style, long $defaultColor, Density $density, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     ProduceStateScope $this$produceState, produceStateScope1;
/*  74 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$produceState = (ProduceStateScope)this.L$0;
/*  75 */         produceStateScope1 = $this$produceState;
/*  76 */         this.L$0 = produceStateScope1; this.label = 1; if (BuildersKt.withContext((CoroutineContext)this.$dispatcher, new Function2<CoroutineScope, Continuation<? super List<? extends Painter>>, Object>(this.$frameRetriever, this.$style, this.$defaultColor, this.$density, null) { int label; public final Object invokeSuspend(Object $result) { long l1; Iterable iterable1; Density density; long l2; int $i$f$map; Iterable iterable2; int $i$f$takeOrElse-DxMtmZc; Collection<Painter> destination$iv$iv; long $this$isSpecified$iv$iv; int $i$f$mapTo, $i$f$isSpecified-8_81llA; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  77 */                     l1 = this.$style.getColor-0d7_KjU(); l2 = this.$defaultColor; $i$f$takeOrElse-DxMtmZc = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     
/* 183 */                     $this$isSpecified$iv$iv = l1; $i$f$isSpecified-8_81llA = 0;
/* 184 */                     if (($this$isSpecified$iv$iv != 16L)) {  } else { Function1<Color, List<String>> function1 = this.$frameRetriever; int $i$a$-takeOrElse-DxMtmZc-CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1$1$1 = 0; long l = l2; }
/* 185 */                      iterable1 = (Iterable)function1.invoke(Color.box-impl(l)); density = this.$density; $i$f$map = 0; iterable2 = iterable1; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10)); $i$f$mapTo = 0;
/* 186 */                     for (Object item$iv$iv : iterable2) {
/* 187 */                       String str = (String)item$iv$iv; Collection<Painter> collection = destination$iv$iv; int $i$a$-map-CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1$1$2 = 0; Intrinsics.checkNotNullExpressionValue(str.getBytes(Charsets.UTF_8), "getBytes(...)"); collection.add(ImageDecoders_skikoKt.decodeToSvgPainter(str.getBytes(Charsets.UTF_8), density));
/* 188 */                     }  return destination$iv$iv; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invokeSuspend(Object $result) { long l1; Iterable iterable1; Density density; long l2; int $i$f$map; Iterable iterable2; int $i$f$takeOrElse-DxMtmZc; Collection<Painter> destination$iv$iv; long $this$isSpecified$iv$iv; int $i$f$mapTo, $i$f$isSpecified-8_81llA; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); l1 = this.$style.getColor-0d7_KjU(); l2 = this.$defaultColor; $i$f$takeOrElse-DxMtmZc = 0; $this$isSpecified$iv$iv = l1; $i$f$isSpecified-8_81llA = 0; if (($this$isSpecified$iv$iv != 16L)) {  } else { Function1<Color, List<String>> function1 = this.$frameRetriever; int $i$a$-takeOrElse-DxMtmZc-CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1$1$1 = 0; long l = l2; }  iterable1 = (Iterable)function1.invoke(Color.box-impl(l)); density = this.$density; $i$f$map = 0; iterable2 = iterable1; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10)); $i$f$mapTo = 0; for (Object item$iv$iv : iterable2) { String str = (String)item$iv$iv; Collection<Painter> collection = destination$iv$iv; int $i$a$-map-CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1$1$2 = 0; Intrinsics.checkNotNullExpressionValue(str.getBytes(Charsets.UTF_8), "getBytes(...)"); collection.add(ImageDecoders_skikoKt.decodeToSvgPainter(str.getBytes(Charsets.UTF_8), density)); }  return destination$iv$iv; }
/*     */                 
/*     */                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */               
/*     */               public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                 return (Continuation)new Function2<>(this.$frameRetriever, this.$style, this.$defaultColor, this.$density, $completion);
/*     */               }
/*     */               
/*     */               public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */               } }
/*     */             (Continuation)this) == object)
/*     */           return object; 
/*     */         produceStateScope1.setValue(BuildersKt.withContext((CoroutineContext)this.$dispatcher, new Function2<CoroutineScope, Continuation<? super List<? extends Painter>>, Object>(this.$frameRetriever, this.$style, this.$defaultColor, this.$density, null) {
/*     */                 int label;
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   return (Continuation)new Function2<>(this.$frameRetriever, this.$style, this.$defaultColor, this.$density, $completion);
/*     */                 }
/*     */                 
/*     */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }(Continuation)this));
/*     */         return Unit.INSTANCE;
/*     */       case 1:
/*     */         produceStateScope1 = (ProduceStateScope)this.L$0;
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         produceStateScope1.setValue(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1> $completion) {
/*     */     CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1 circularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1 = new CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1(this.$dispatcher, this.$frameRetriever, this.$style, this.$defaultColor, this.$density, $completion);
/*     */     circularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1.L$0 = value;
/*     */     return (Continuation<Unit>)circularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1;
/*     */   }
/*     */   
/*     */   public final Object invoke(ProduceStateScope p1, Continuation<?> p2) {
/*     */     return ((CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */