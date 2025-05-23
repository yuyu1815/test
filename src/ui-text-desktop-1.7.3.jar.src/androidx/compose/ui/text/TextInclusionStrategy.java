/*    */ package androidx.compose.ui.text;
/*    */ 
/*    */ import androidx.compose.ui.geometry.Rect;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\bæ\001\030\000 \0072\0020\001:\001\007J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\005H&ø\001\000\002\006\n\004\b!0\001¨\006\bÀ\006\001"}, d2 = {"Landroidx/compose/ui/text/TextInclusionStrategy;", "", "isIncluded", "", "textBounds", "Landroidx/compose/ui/geometry/Rect;", "rect", "Companion", "ui-text"})
/*    */ public interface TextInclusionStrategy
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   boolean isIncluded(@NotNull Rect paramRect1, @NotNull Rect paramRect2);
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\007\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006¨\006\013"}, d2 = {"Landroidx/compose/ui/text/TextInclusionStrategy$Companion;", "", "()V", "AnyOverlap", "Landroidx/compose/ui/text/TextInclusionStrategy;", "getAnyOverlap", "()Landroidx/compose/ui/text/TextInclusionStrategy;", "ContainsAll", "getContainsAll", "ContainsCenter", "getContainsCenter", "ui-text"})
/*    */   public static final class Companion
/*    */   {
/*    */     @NotNull
/* 41 */     private static final TextInclusionStrategy AnyOverlap = Companion::AnyOverlap$lambda$0; @NotNull public final TextInclusionStrategy getAnyOverlap() { return AnyOverlap; } private static final boolean AnyOverlap$lambda$0(Rect textBounds, Rect rect) {
/* 42 */       Intrinsics.checkNotNullParameter(textBounds, "textBounds"); Intrinsics.checkNotNullParameter(rect, "rect"); return textBounds.overlaps(rect);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @NotNull
/* 49 */     private static final TextInclusionStrategy ContainsAll = Companion::ContainsAll$lambda$1; @NotNull public final TextInclusionStrategy getContainsAll() { return ContainsAll; } private static final boolean ContainsAll$lambda$1(Rect textBounds, Rect rect) {
/* 50 */       Intrinsics.checkNotNullParameter(textBounds, "textBounds"); Intrinsics.checkNotNullParameter(rect, "rect"); return (!rect.isEmpty() && textBounds.getLeft() >= rect.getLeft() && textBounds.getRight() <= rect.getRight() && 
/* 51 */         textBounds.getTop() >= rect.getTop() && textBounds.getBottom() <= rect.getBottom());
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @NotNull
/* 58 */     private static final TextInclusionStrategy ContainsCenter = Companion::ContainsCenter$lambda$2; @NotNull public final TextInclusionStrategy getContainsCenter() { return ContainsCenter; } private static final boolean ContainsCenter$lambda$2(Rect textBounds, Rect rect) {
/* 59 */       Intrinsics.checkNotNullParameter(textBounds, "textBounds"); Intrinsics.checkNotNullParameter(rect, "rect"); return rect.contains-k-4lQ0M(textBounds.getCenter-F1C5BW0());
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\TextInclusionStrategy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */