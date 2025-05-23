/*    */ package org.jetbrains.jewel.ui;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ public final class DefaultImpls {
/*    */   @NotNull
/*    */   public static ComponentStyling provide(@NotNull ComponentStyling $this, @NotNull ProvidedValue... values) {
/*  8 */     Intrinsics.checkNotNullParameter(values, "values"); if ((values.length == 0)) return $this; 
/*  9 */     return $this.with(new StaticComponentStyling((ProvidedValue<?>[])values));
/*    */   }
/*    */   @NotNull
/*    */   public static ComponentStyling provide(@NotNull ComponentStyling $this, @NotNull Function2<? super Composer, ? super Integer, ? extends ProvidedValue<?>[]> provider) {
/* 13 */     Intrinsics.checkNotNullParameter(provider, "provider"); return $this.with(new LazyComponentStyling(provider));
/*    */   } @NotNull
/*    */   public static ComponentStyling with(@NotNull ComponentStyling $this, @NotNull ComponentStyling styling) {
/* 16 */     Intrinsics.checkNotNullParameter(styling, "styling"); if (styling instanceof ComponentStyling.Companion) return $this; 
/* 17 */     return new CombinedComponentStyling($this, styling);
/*    */   }
/*    */   @NotNull
/*    */   public static ComponentStyling with(@NotNull ComponentStyling $this, @NotNull Function2<? super Composer, ? super Integer, ? extends ComponentStyling> styling) {
/* 21 */     Intrinsics.checkNotNullParameter(styling, "styling"); return $this.with(new LazyComponentStyling(new ComponentStyling$with$1(styling)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\ComponentStyling$DefaultImpls.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */