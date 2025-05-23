/*     */ package androidx.compose.ui.unit;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\033\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\b\030\000 *2\0020\001:\001*B\027\b\026\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006B%\022\006\020\007\032\0020\b\022\006\020\t\032\0020\b\022\006\020\n\032\0020\b\022\006\020\013\032\0020\b¢\006\002\020\fJ\026\020\030\032\0020\bHÆ\003ø\001\001ø\001\000¢\006\004\b\031\020\020J\026\020\032\032\0020\bHÆ\003ø\001\001ø\001\000¢\006\004\b\033\020\020J\026\020\034\032\0020\bHÆ\003ø\001\001ø\001\000¢\006\004\b\035\020\020J\026\020\036\032\0020\bHÆ\003ø\001\001ø\001\000¢\006\004\b\037\020\020J;\020 \032\0020\0002\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\b2\b\b\002\020\n\032\0020\b2\b\b\002\020\013\032\0020\bHÆ\001ø\001\000¢\006\004\b!\020\"J\023\020#\032\0020$2\b\020%\032\004\030\0010\001HÖ\003J\t\020&\032\0020'HÖ\001J\t\020(\032\0020)HÖ\001R$\020\013\032\0020\b8\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\021\022\004\b\r\020\016\032\004\b\017\020\020R$\020\007\032\0020\b8\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\021\022\004\b\022\020\016\032\004\b\023\020\020R$\020\n\032\0020\b8\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\021\022\004\b\024\020\016\032\004\b\025\020\020R$\020\t\032\0020\b8\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\021\022\004\b\026\020\016\032\004\b\027\020\020\002\013\n\005\b¡\0360\001\n\002\b!¨\006+"}, d2 = {"Landroidx/compose/ui/unit/DpRect;", "", "origin", "Landroidx/compose/ui/unit/DpOffset;", "size", "Landroidx/compose/ui/unit/DpSize;", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "left", "Landroidx/compose/ui/unit/Dp;", "top", "right", "bottom", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottom-D9Ej5fM$annotations", "()V", "getBottom-D9Ej5fM", "()F", "F", "getLeft-D9Ej5fM$annotations", "getLeft-D9Ej5fM", "getRight-D9Ej5fM$annotations", "getRight-D9Ej5fM", "getTop-D9Ej5fM$annotations", "getTop-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "component4", "component4-D9Ej5fM", "copy", "copy-a9UjIt4", "(FFFF)Landroidx/compose/ui/unit/DpRect;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ui-unit"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,577:1\n51#2:578\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n*L\n555#1:578\n*E\n"})
/*     */ public final class DpRect
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final float left;
/*     */   private final float top;
/*     */   private final float right;
/*     */   private final float bottom;
/*     */   public static final int $stable;
/*     */   
/*     */   public final float getLeft-D9Ej5fM() {
/*     */     return this.left;
/*     */   }
/*     */   
/*     */   private DpRect(float left, float top, float right, float bottom) {
/* 542 */     this.left = left;
/*     */     
/* 544 */     this.top = top;
/*     */     
/* 546 */     this.right = right;
/*     */     
/* 548 */     this.bottom = bottom; } public final float getBottom-D9Ej5fM() {
/* 549 */     return this.bottom;
/*     */   }
/*     */   public final float getTop-D9Ej5fM() {
/*     */     return this.top;
/*     */   }
/*     */   private DpRect(long origin, long size) {
/* 555 */     this(DpOffset.getX-D9Ej5fM(origin), DpOffset.getY-D9Ej5fM(origin), 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 578 */         Dp.constructor-impl(f1 + other$iv), Dp.constructor-impl(arg0$iv + other$iv), null);
/*     */   }
/*     */   
/*     */   public final float getRight-D9Ej5fM() {
/*     */     return this.right;
/*     */   }
/*     */   
/*     */   public final float component1-D9Ej5fM() {
/*     */     return this.left;
/*     */   }
/*     */   
/*     */   public final float component2-D9Ej5fM() {
/*     */     return this.top;
/*     */   }
/*     */   
/*     */   public final float component3-D9Ej5fM() {
/*     */     return this.right;
/*     */   }
/*     */   
/*     */   public final float component4-D9Ej5fM() {
/*     */     return this.bottom;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final DpRect copy-a9UjIt4(float left, float top, float right, float bottom) {
/*     */     return new DpRect(left, top, right, bottom, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "DpRect(left=" + Dp.toString-impl(this.left) + ", top=" + Dp.toString-impl(this.top) + ", right=" + Dp.toString-impl(this.right) + ", bottom=" + Dp.toString-impl(this.bottom) + ')';
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Dp.hashCode-impl(this.left);
/*     */     result = result * 31 + Dp.hashCode-impl(this.top);
/*     */     result = result * 31 + Dp.hashCode-impl(this.right);
/*     */     return result * 31 + Dp.hashCode-impl(this.bottom);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof DpRect))
/*     */       return false; 
/*     */     DpRect dpRect = (DpRect)other;
/*     */     return !Dp.equals-impl0(this.left, dpRect.left) ? false : (!Dp.equals-impl0(this.top, dpRect.top) ? false : (!Dp.equals-impl0(this.right, dpRect.right) ? false : (!!Dp.equals-impl0(this.bottom, dpRect.bottom))));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Landroidx/compose/ui/unit/DpRect$Companion;", "", "()V", "ui-unit"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\DpRect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */