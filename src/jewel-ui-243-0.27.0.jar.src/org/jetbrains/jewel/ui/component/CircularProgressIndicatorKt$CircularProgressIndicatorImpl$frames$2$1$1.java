/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
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
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Charsets;
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
/*     */ @DebugMetadata(f = "CircularProgressIndicator.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1$1")
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/painter/Painter;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nCircularProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularProgressIndicator.kt\norg/jetbrains/jewel/ui/component/CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1$1\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n708#2:183\n696#2:184\n1549#3:185\n1620#3,3:186\n*S KotlinDebug\n*F\n+ 1 CircularProgressIndicator.kt\norg/jetbrains/jewel/ui/component/CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1$1\n*L\n77#1:183\n77#1:184\n77#1:185\n77#1:186,3\n*E\n"})
/*     */ final class null
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super List<? extends Painter>>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   null(Function1<Color, List<String>> $frameRetriever, CircularProgressStyle $style, long $defaultColor, Density $density, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     long l1;
/*     */     Iterable iterable1;
/*     */     Density density;
/*     */     long l2;
/*     */     int $i$f$map;
/*     */     Iterable iterable2;
/*     */     int $i$f$takeOrElse-DxMtmZc;
/*     */     Collection<Painter> destination$iv$iv;
/*     */     long $this$isSpecified$iv$iv;
/*     */     int $i$f$mapTo, $i$f$isSpecified-8_81llA;
/*  76 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  77 */         l1 = this.$style.getColor-0d7_KjU(); l2 = this.$defaultColor; $i$f$takeOrElse-DxMtmZc = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 183 */         $this$isSpecified$iv$iv = l1; $i$f$isSpecified-8_81llA = 0;
/* 184 */         if (($this$isSpecified$iv$iv != 16L)) {  } else { Function1<Color, List<String>> function1 = this.$frameRetriever; int $i$a$-takeOrElse-DxMtmZc-CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1$1$1 = 0; long l = l2; }
/* 185 */          iterable1 = (Iterable)function1.invoke(Color.box-impl(l)); density = this.$density; $i$f$map = 0; iterable2 = iterable1; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10)); $i$f$mapTo = 0;
/* 186 */         for (Object item$iv$iv : iterable2) {
/* 187 */           String str = (String)item$iv$iv; Collection<Painter> collection = destination$iv$iv; int $i$a$-map-CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1$1$2 = 0; Intrinsics.checkNotNullExpressionValue(str.getBytes(Charsets.UTF_8), "getBytes(...)"); collection.add(ImageDecoders_skikoKt.decodeToSvgPainter(str.getBytes(Charsets.UTF_8), density));
/* 188 */         }  return destination$iv$iv; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */     return (Continuation<Unit>)new Object(this.$frameRetriever, this.$style, this.$defaultColor, this.$density, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */