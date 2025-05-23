/*    */ package org.jetbrains.jewel.ui;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.ProvidedValue;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\021\n\002\030\002\n\002\b\002\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0012\006\020\005\032\0020\001H\026J\031\020\006\032\016\022\n\b\001\022\006\022\002\b\0030\b0\007H\027¢\006\002\020\tJ\b\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Lorg/jetbrains/jewel/ui/ComponentStyling$Companion;", "Lorg/jetbrains/jewel/ui/ComponentStyling;", "<init>", "()V", "with", "styling", "styles", "", "Landroidx/compose/runtime/ProvidedValue;", "(Landroidx/compose/runtime/Composer;I)[Landroidx/compose/runtime/ProvidedValue;", "toString", "", "ui"})
/*    */ public final class Companion
/*    */   implements ComponentStyling
/*    */ {
/*    */   @NotNull
/*    */   public ComponentStyling provide(@NotNull ProvidedValue... values) {
/* 25 */     return ComponentStyling.DefaultImpls.provide(this, (ProvidedValue<?>[])values); } @NotNull public ComponentStyling provide(@NotNull Function2<? super Composer, ? super Integer, ? extends ProvidedValue<?>[]> provider) { return ComponentStyling.DefaultImpls.provide(this, provider); } @NotNull public ComponentStyling with(@NotNull Function2<? super Composer, ? super Integer, ? extends ComponentStyling> styling) { return ComponentStyling.DefaultImpls.with(this, styling); } @NotNull
/* 26 */   public ComponentStyling with(@NotNull ComponentStyling styling) { Intrinsics.checkNotNullParameter(styling, "styling"); return styling; } @Composable
/*    */   @NotNull
/* 28 */   public ProvidedValue<?>[] styles(@Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-1850539880); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1850539880, $changed, -1, "org.jetbrains.jewel.ui.ComponentStyling.Companion.styles (ComponentStyling.kt:27)");  ProvidedValue[] arrayOfProvidedValue = new ProvidedValue[0]; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (ProvidedValue<?>[])arrayOfProvidedValue; } @NotNull
/*    */   public String toString() {
/* 30 */     return "ComponentStyleProvider";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\ComponentStyling$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */