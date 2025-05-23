/*     */ package org.jetbrains.jewel.foundation.lazy.tree;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ULong;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.state.CommonStateBitMask;
/*     */ import org.jetbrains.jewel.foundation.state.FocusableComponentState;
/*     */ import org.jetbrains.jewel.foundation.state.SelectableComponentState;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JvmInline
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\027\n\002\020\016\n\002\b\016\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\004\b@\030\000 92\0020\0012\0020\002:\0019B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006J\017\020\"\032\0020#H\026¢\006\004\b$\020%JS\020&\032\0020\0002\b\b\002\020'\032\0020\0132\b\b\002\020(\032\0020\0132\b\b\002\020)\032\0020\0132\b\b\002\020*\032\0020\0132\b\b\002\020+\032\0020\0132\b\b\002\020,\032\0020\0132\b\b\002\020-\032\0020\013¢\006\004\b.\020/J\032\0200\032\0020\0132\b\0201\032\004\030\00102HÖ\003¢\006\004\b3\0204J\020\0205\032\00206HÖ\001¢\006\004\b7\0208R\023\020\003\032\0020\004¢\006\n\n\002\020\t\032\004\b\007\020\bR\032\020\n\032\0020\0138VX\004¢\006\f\022\004\b\f\020\r\032\004\b\016\020\017R\032\020\020\032\0020\0138VX\004¢\006\f\022\004\b\021\020\r\032\004\b\022\020\017R\032\020\023\032\0020\0138VX\004¢\006\f\022\004\b\024\020\r\032\004\b\025\020\017R\032\020\026\032\0020\0138VX\004¢\006\f\022\004\b\027\020\r\032\004\b\030\020\017R\032\020\031\032\0020\0138VX\004¢\006\f\022\004\b\032\020\r\032\004\b\033\020\017R\032\020\034\032\0020\0138VX\004¢\006\f\022\004\b\035\020\r\032\004\b\036\020\017R\032\020\037\032\0020\0138FX\004¢\006\f\022\004\b \020\r\032\004\b!\020\017\001\003¨\006:"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/TreeElementState;", "Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;", "Lorg/jetbrains/jewel/foundation/state/SelectableComponentState;", "state", "Lkotlin/ULong;", "constructor-impl", "(J)J", "getState-s-VKNKU", "()J", "J", "isActive", "", "isActive$annotations", "()V", "isActive-impl", "(J)Z", "isEnabled", "isEnabled$annotations", "isEnabled-impl", "isFocused", "isFocused$annotations", "isFocused-impl", "isPressed", "isPressed$annotations", "isPressed-impl", "isHovered", "isHovered$annotations", "isHovered-impl", "isSelected", "isSelected$annotations", "isSelected-impl", "isExpanded", "isExpanded$annotations", "isExpanded-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "copy", "enabled", "focused", "expanded", "pressed", "hovered", "active", "selected", "copy-do3-xvo", "(JZZZZZZZ)J", "equals", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "Companion", "foundation"})
/*     */ @Immutable
/*     */ public final class TreeElementState
/*     */   implements FocusableComponentState, SelectableComponentState
/*     */ {
/*     */   @Composable
/*     */   public static <T> T chooseValue-impl(long arg0, Object normal, Object disabled, Object focused, Object pressed, Object hovered, Object active, @Nullable Composer $composer, int $changed) {
/* 214 */     return box-impl(arg0).chooseValue((T)normal, (T)disabled, (T)focused, (T)pressed, (T)hovered, (T)active, $composer, $changed); } @Composable public <T> T chooseValue(Object normal, Object disabled, Object focused, Object pressed, Object hovered, Object active, @Nullable Composer $composer, int $changed) { return (T)FocusableComponentState.DefaultImpls.chooseValue(this, normal, disabled, focused, pressed, hovered, active, $composer, $changed); }
/*     */    public final long getState-s-VKNKU() {
/* 216 */     return this.state;
/*     */   }
/*     */   
/* 219 */   public static boolean isActive-impl(long arg0) { return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getActive-s-VKNKU()) != 0L); } public boolean isActive() { return isActive-impl(this.state); }
/*     */ 
/*     */   
/*     */   public static boolean isEnabled-impl(long arg0) {
/* 223 */     return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getEnabled-s-VKNKU()) != 0L); } public boolean isEnabled() { return isEnabled-impl(this.state); }
/*     */ 
/*     */   
/*     */   public static boolean isFocused-impl(long arg0) {
/* 227 */     return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getFocused-s-VKNKU()) != 0L); } public boolean isFocused() { return isFocused-impl(this.state); }
/*     */ 
/*     */   
/*     */   public static boolean isPressed-impl(long arg0) {
/* 231 */     return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getPressed-s-VKNKU()) != 0L); } public boolean isPressed() { return isPressed-impl(this.state); }
/*     */ 
/*     */   
/*     */   public static boolean isHovered-impl(long arg0) {
/* 235 */     return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getHovered-s-VKNKU()) != 0L); } public boolean isHovered() { return isHovered-impl(this.state); }
/*     */ 
/*     */   
/*     */   public static boolean isSelected-impl(long arg0) {
/* 239 */     return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getSelected-s-VKNKU()) != 0L); } public boolean isSelected() { return isSelected-impl(this.state); }
/*     */ 
/*     */   
/*     */   public static final boolean isExpanded-impl(long arg0) {
/* 243 */     return (ULong.constructor-impl(arg0 & Expanded) != 0L);
/*     */   } @NotNull
/* 245 */   public String toString() { return toString-impl(this.state); } @NotNull
/* 246 */   public static String toString-impl(long arg0) { return box-impl(arg0).getClass().getSimpleName() + "(enabled=" + box-impl(arg0).getClass().getSimpleName() + ", focused=" + isEnabled-impl(arg0) + ", expanded=" + isFocused-impl(arg0) + ", pressed=" + isExpanded-impl(arg0) + ", hovered=" + 
/* 247 */       isPressed-impl(arg0) + ", active=" + isHovered-impl(arg0) + ", selected=" + isActive-impl(arg0) + ")"; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final long copy-do3-xvo(long arg0, boolean enabled, boolean focused, boolean expanded, boolean pressed, boolean hovered, boolean active, boolean selected) {
/* 258 */     return Companion.of-do3-xvo(
/* 259 */         enabled, 
/* 260 */         focused, 
/* 261 */         expanded, 
/*     */         
/* 263 */         hovered, pressed, 
/* 264 */         active, 
/* 265 */         selected);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\t\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003JS\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\f2\b\b\002\020\016\032\0020\f2\b\b\002\020\017\032\0020\f2\b\b\002\020\020\032\0020\f2\b\b\002\020\021\032\0020\f2\b\b\002\020\022\032\0020\f¢\006\004\b\023\020\024R\016\020\004\032\0020\005XT¢\006\002\n\000R\020\020\006\032\0020\007X\004¢\006\004\n\002\020\b¨\006\025"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/TreeElementState$Companion;", "", "<init>", "()V", "EXPANDED_BIT_OFFSET", "", "Expanded", "Lkotlin/ULong;", "J", "of", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeElementState;", "enabled", "", "focused", "expanded", "hovered", "pressed", "active", "selected", "of-do3-xvo", "(ZZZZZZZ)J", "foundation"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final long of-do3-xvo(boolean enabled, boolean focused, boolean expanded, boolean hovered, boolean pressed, boolean active, boolean selected) {
/* 282 */       return TreeElementState.constructor-impl(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 289 */           ULong.constructor-impl(ULong.constructor-impl(ULong.constructor-impl(ULong.constructor-impl(ULong.constructor-impl(ULong.constructor-impl((expanded ? TreeElementState.Expanded : 0L) | (enabled ? CommonStateBitMask.INSTANCE.getEnabled-s-VKNKU() : 0L)) | (focused ? CommonStateBitMask.INSTANCE.getFocused-s-VKNKU() : 0L)) | (pressed ? CommonStateBitMask.INSTANCE.getPressed-s-VKNKU() : 0L)) | (hovered ? CommonStateBitMask.INSTANCE.getHovered-s-VKNKU() : 0L)) | (selected ? CommonStateBitMask.INSTANCE.getSelected-s-VKNKU() : 0L)) | (active ? CommonStateBitMask.INSTANCE.getActive-s-VKNKU() : 0L)));
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final long state;
/*     */   private static final int EXPANDED_BIT_OFFSET = 7;
/*     */   private static final long Expanded = ULong.constructor-impl(1L << 7L);
/*     */   
/*     */   public static int hashCode-impl(long arg0) {
/*     */     return ULong.hashCode-impl(arg0);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return hashCode-impl(this.state);
/*     */   }
/*     */   
/*     */   public static boolean equals-impl(long arg0, Object other) {
/*     */     if (!(other instanceof TreeElementState))
/*     */       return false; 
/*     */     long l = ((TreeElementState)other).unbox-impl();
/*     */     return !(arg0 != l);
/*     */   }
/*     */   
/*     */   public boolean equals(Object other) {
/*     */     return equals-impl(this.state, other);
/*     */   }
/*     */   
/*     */   public static long constructor-impl(long state) {
/*     */     return state;
/*     */   }
/*     */   
/*     */   public static final boolean equals-impl0(long p1, long p2) {
/*     */     return ULong.equals-impl0(p1, p2);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\TreeElementState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */