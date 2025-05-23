/*    */ package org.jetbrains.jewel.foundation;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\013\b\007\030\000 \r2\0020\001:\001\rB\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\004\b\006\020\007R\023\020\002\032\0020\003¢\006\n\n\002\020\n\032\004\b\b\020\tR\023\020\004\032\0020\003¢\006\n\n\002\020\n\032\004\b\013\020\tR\023\020\005\032\0020\003¢\006\n\n\002\020\n\032\004\b\f\020\t¨\006\016"}, d2 = {"Lorg/jetbrains/jewel/foundation/BorderColors;", "", "normal", "Landroidx/compose/ui/graphics/Color;", "focused", "disabled", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getNormal-0d7_KjU", "()J", "J", "getFocused-0d7_KjU", "getDisabled-0d7_KjU", "Companion", "foundation"})
/*    */ @Immutable
/*    */ public final class BorderColors
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long normal;
/*    */   private final long focused;
/*    */   private final long disabled;
/*    */   public static final int $stable;
/*    */   
/*    */   private BorderColors(long normal, long focused, long disabled) {
/* 33 */     this.normal = normal; this.focused = focused; this.disabled = disabled; } public final long getNormal-0d7_KjU() { return this.normal; } public final long getFocused-0d7_KjU() { return this.focused; } public final long getDisabled-0d7_KjU() { return this.disabled; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof BorderColors))
/*    */       return false; 
/*    */     BorderColors borderColors = (BorderColors)other;
/*    */     return !Color.equals-impl0(this.normal, borderColors.normal) ? false : (!Color.equals-impl0(this.focused, borderColors.focused) ? false : (!!Color.equals-impl0(this.disabled, borderColors.disabled)));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.normal);
/*    */     result = result * 31 + Color.hashCode-impl(this.focused);
/*    */     return result * 31 + Color.hashCode-impl(this.disabled);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "BorderColors(normal=" + Color.toString-impl(this.normal) + ", focused=" + Color.toString-impl(this.focused) + ", disabled=" + Color.toString-impl(this.disabled) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/foundation/BorderColors$Companion;", "", "<init>", "()V", "foundation"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\BorderColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */