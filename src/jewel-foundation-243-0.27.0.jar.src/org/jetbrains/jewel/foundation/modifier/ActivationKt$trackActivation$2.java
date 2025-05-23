/*     */ package org.jetbrains.jewel.foundation.modifier;
/*     */ 
/*     */ import androidx.compose.foundation.FocusableKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.focus.FocusChangedModifierKt;
/*     */ import androidx.compose.ui.focus.FocusState;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nActivation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Activation.kt\norg/jetbrains/jewel/foundation/modifier/ActivationKt$trackActivation$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,163:1\n1225#2,6:164\n1225#2,6:170\n*S KotlinDebug\n*F\n+ 1 Activation.kt\norg/jetbrains/jewel/foundation/modifier/ActivationKt$trackActivation$2\n*L\n87#1:164,6\n89#1:170,6\n*E\n"})
/*     */ final class ActivationKt$trackActivation$2
/*     */   implements Function3<Modifier, Composer, Integer, Modifier>
/*     */ {
/*     */   public static final ActivationKt$trackActivation$2 INSTANCE = new ActivationKt$trackActivation$2();
/*     */   
/*     */   @Composable
/*     */   public final Modifier invoke(Modifier $this$composed, Composer $composer, int $changed) {
/*  87 */     Intrinsics.checkNotNullParameter($this$composed, "$this$composed"); $composer.startReplaceGroup(-1148956750); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1148956750, $changed, -1, "org.jetbrains.jewel.foundation.modifier.trackActivation.<anonymous> (Activation.kt:86)");  $composer.startReplaceGroup(-1740740772); Composer composer1 = $composer; boolean invalid$iv = false; int $i$f$cache = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 164 */     Object it$iv = composer1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 165 */     if (it$iv == Composer.Companion.getEmpty()) {
/* 166 */       int $i$a$-cache-ActivationKt$trackActivation$2$activatedModifierLocal$1 = 0; Object value$iv = new ActivatedModifierLocal();
/* 167 */       composer1.updateRememberedValue(value$iv);
/*     */     } 
/* 169 */     ActivatedModifierLocal activatedModifierLocal1 = (ActivatedModifierLocal)it$iv; $composer.endReplaceGroup(); ActivatedModifierLocal activatedModifierLocal = activatedModifierLocal1; $composer.startReplaceGroup(-1740737522); Composer composer2 = $composer; boolean bool1 = false; int i = 0;
/* 170 */     Object object1 = composer2.rememberedValue(); int j = 0;
/* 171 */     if (object1 == Composer.Companion.getEmpty()) {
/* 172 */       Modifier modifier1 = FocusableKt.focusGroup((Modifier)Modifier.Companion); int $i$a$-cache-ActivationKt$trackActivation$2$1 = 0; Object value$iv = activatedModifierLocal::invoke$lambda$2$lambda$1;
/* 173 */       composer2.updateRememberedValue(value$iv);
/*     */     } 
/* 175 */     Function1 function1 = (Function1)object1;
/*     */     $composer.endReplaceGroup();
/*     */     Modifier modifier = FocusChangedModifierKt.onFocusChanged(modifier1, function1).then((Modifier)activatedModifierLocal);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return modifier;
/*     */   }
/*     */   
/*     */   private static final Unit invoke$lambda$2$lambda$1(ActivatedModifierLocal $activatedModifierLocal, FocusState it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     if (it.getHasFocus()) {
/*     */       $activatedModifierLocal.childGainedFocus();
/*     */     } else {
/*     */       $activatedModifierLocal.childLostFocus();
/*     */     } 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\modifier\ActivationKt$trackActivation$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */