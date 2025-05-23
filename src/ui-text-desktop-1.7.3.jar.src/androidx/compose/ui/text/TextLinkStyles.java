/*    */ package androidx.compose.ui.text;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\b\007\030\0002\0020\001B5\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\003\022\n\b\002\020\005\032\004\030\0010\003\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\001H\002J\b\020\020\032\0020\021H\026R\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\b\020\tR\023\020\005\032\004\030\0010\003¢\006\b\n\000\032\004\b\n\020\tR\023\020\006\032\004\030\0010\003¢\006\b\n\000\032\004\b\013\020\tR\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\f\020\t¨\006\022"}, d2 = {"Landroidx/compose/ui/text/TextLinkStyles;", "", "style", "Landroidx/compose/ui/text/SpanStyle;", "focusedStyle", "hoveredStyle", "pressedStyle", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;)V", "getFocusedStyle", "()Landroidx/compose/ui/text/SpanStyle;", "getHoveredStyle", "getPressedStyle", "getStyle", "equals", "", "other", "hashCode", "", "ui-text"})
/*    */ @Immutable
/*    */ public final class TextLinkStyles
/*    */ {
/*    */   @Nullable
/*    */   private final SpanStyle style;
/*    */   @Nullable
/*    */   private final SpanStyle focusedStyle;
/*    */   @Nullable
/*    */   private final SpanStyle hoveredStyle;
/*    */   @Nullable
/*    */   private final SpanStyle pressedStyle;
/*    */   public static final int $stable;
/*    */   
/*    */   public TextLinkStyles(@Nullable SpanStyle style, @Nullable SpanStyle focusedStyle, @Nullable SpanStyle hoveredStyle, @Nullable SpanStyle pressedStyle) {
/* 45 */     this.style = style;
/* 46 */     this.focusedStyle = focusedStyle;
/* 47 */     this.hoveredStyle = hoveredStyle;
/* 48 */     this.pressedStyle = pressedStyle; } @Nullable public final SpanStyle getStyle() { return this.style; } @Nullable public final SpanStyle getPressedStyle() { return this.pressedStyle; }
/*    */   @Nullable public final SpanStyle getFocusedStyle() { return this.focusedStyle; }
/*    */   @Nullable
/* 51 */   public final SpanStyle getHoveredStyle() { return this.hoveredStyle; } public boolean equals(@Nullable Object other) { if (this == other) return true; 
/* 52 */     if (other == null || !(other instanceof TextLinkStyles)) return false;
/*    */     
/* 54 */     if (!Intrinsics.areEqual(this.style, ((TextLinkStyles)other).style)) return false; 
/* 55 */     if (!Intrinsics.areEqual(this.focusedStyle, ((TextLinkStyles)other).focusedStyle)) return false; 
/* 56 */     if (!Intrinsics.areEqual(this.hoveredStyle, ((TextLinkStyles)other).hoveredStyle)) return false; 
/* 57 */     if (!Intrinsics.areEqual(this.pressedStyle, ((TextLinkStyles)other).pressedStyle)) return false;
/*    */     
/* 59 */     return true; }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 63 */     int result = (this.style != null) ? this.style.hashCode() : 0;
/* 64 */     result = 31 * result + ((this.focusedStyle != null) ? this.focusedStyle.hashCode() : 0);
/* 65 */     result = 31 * result + ((this.hoveredStyle != null) ? this.hoveredStyle.hashCode() : 0);
/* 66 */     result = 31 * result + ((this.pressedStyle != null) ? this.pressedStyle.hashCode() : 0);
/* 67 */     return result;
/*    */   }
/*    */   
/*    */   public TextLinkStyles() {
/*    */     this(null, null, null, null, 15, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\TextLinkStyles.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */