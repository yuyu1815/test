/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.CompositionLocal;
/*    */ import androidx.compose.runtime.CompositionLocalKt;
/*    */ import androidx.compose.runtime.ProvidedValue;
/*    */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.functions.Function4;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyItemScope;
/*    */ import org.jetbrains.jewel.foundation.lazy.tree.Tree;
/*    */ import org.jetbrains.jewel.foundation.lazy.tree.TreeElementState;
/*    */ import org.jetbrains.jewel.foundation.theme.JewelThemeKt;
/*    */ import org.jetbrains.jewel.ui.component.styling.LazyTreeStyle;
/*    */ import org.jetbrains.jewel.ui.component.styling.LazyTreeStylingKt;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nLazyTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyTree.kt\norg/jetbrains/jewel/ui/component/LazyTreeKt$LazyTree$5\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,69:1\n708#2:70\n696#2:71\n77#3:72\n*S KotlinDebug\n*F\n+ 1 LazyTree.kt\norg/jetbrains/jewel/ui/component/LazyTreeKt$LazyTree$5\n*L\n64#1:70\n64#1:71\n64#1:72\n*E\n"})
/*    */ final class LazyTreeKt$LazyTree$5
/*    */   implements Function4<SelectableLazyItemScope, Tree.Element<T>, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(SelectableLazyItemScope $this$BasicLazyTree, Tree.Element<T> it, Composer $composer, int $changed) {
/* 60 */     Intrinsics.checkNotNullParameter($this$BasicLazyTree, "$this$BasicLazyTree"); Intrinsics.checkNotNullParameter(it, "it"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1240032589, $changed, -1, "org.jetbrains.jewel.ui.component.LazyTree.<anonymous> (LazyTree.kt:59)");  $composer.startReplaceGroup(-129362953);
/*    */     
/* 62 */     TreeElementState.Companion companion = TreeElementState.Companion; boolean bool1 = $this$BasicLazyTree.isActive(), bool2 = $this$BasicLazyTree.isSelected();
/* 63 */     long $this$takeOrElse_u2dDxMtmZc$iv = ((Color)LazyTreeStylingKt.contentFor-e9js8XA(this.$style.getColors(), TreeElementState.Companion.of-do3-xvo$default(companion, false, bool1, false, false, false, false, bool2, 57, null), $composer, 0).getValue()).unbox-impl();
/* 64 */     int $i$f$takeOrElse-DxMtmZc = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 70 */     long $this$isSpecified$iv$iv = $this$takeOrElse_u2dDxMtmZc$iv; int $i$f$isSpecified-8_81llA = 0;
/* 71 */     if (($this$isSpecified$iv$iv != 16L)) {  }
/* 72 */     else { int $i$a$-takeOrElse-DxMtmZc-LazyTreeKt$LazyTree$5$resolvedContentColor$1 = 0; CompositionLocal compositionLocal = (CompositionLocal)JewelThemeKt.getLocalContentColor(); int $changed$iv = 0, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); }  Object object2 = object;
/*    */     $composer.endReplaceGroup();
/*    */     Object object1 = object2;
/*    */     CompositionLocalKt.CompositionLocalProvider(JewelThemeKt.getLocalContentColor().provides(Color.box-impl(object1)), (Function2)ComposableLambdaKt.rememberComposableLambda(856578573, true, new Function2<Composer, Integer, Unit>(this.$nodeContent, $this$BasicLazyTree, it) {
/*    */             @Composable
/*    */             @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */             public final void invoke(Composer $composer, int $changed) {
/*    */               if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*    */                 if (ComposerKt.isTraceInProgress())
/*    */                   ComposerKt.traceEventStart(856578573, $changed, -1, "org.jetbrains.jewel.ui.component.LazyTree.<anonymous>.<anonymous> (LazyTree.kt:65)"); 
/*    */                 this.$nodeContent.invoke(this.$this_BasicLazyTree, this.$it, $composer, Integer.valueOf(0));
/*    */                 if (ComposerKt.isTraceInProgress())
/*    */                   ComposerKt.traceEventEnd(); 
/*    */               } else {
/*    */                 $composer.skipToGroupEnd();
/*    */               } 
/*    */             }
/*    */           }$composer, 54), $composer, 0x30 | ProvidedValue.$stable);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */   }
/*    */   
/*    */   LazyTreeKt$LazyTree$5(LazyTreeStyle $style, Function4<SelectableLazyItemScope, Tree.Element<T>, Composer, Integer, Unit> $nodeContent) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\LazyTreeKt$LazyTree$5.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */