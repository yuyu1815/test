/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.Immutable;
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
/*     */ @JvmInline
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\026\n\002\020\016\n\002\b\004\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\004\b@\030\000 .2\0020\0012\0020\002:\001.B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006JI\020\030\032\0020\0002\b\b\002\020\031\032\0020\0132\b\b\002\020\032\032\0020\0132\b\b\002\020\033\032\0020\0132\b\b\002\020\034\032\0020\0132\b\b\002\020\035\032\0020\0132\b\b\002\020\036\032\0020\013¢\006\004\b\037\020 J\017\020!\032\0020\"H\026¢\006\004\b#\020$J\032\020%\032\0020\0132\b\020&\032\004\030\0010'HÖ\003¢\006\004\b(\020)J\020\020*\032\0020+HÖ\001¢\006\004\b,\020-R\023\020\003\032\0020\004¢\006\n\n\002\020\t\032\004\b\007\020\bR\024\020\n\032\0020\0138VX\004¢\006\006\032\004\b\f\020\rR\024\020\016\032\0020\0138VX\004¢\006\006\032\004\b\017\020\rR\024\020\020\032\0020\0138VX\004¢\006\006\032\004\b\021\020\rR\024\020\022\032\0020\0138VX\004¢\006\006\032\004\b\023\020\rR\024\020\024\032\0020\0138VX\004¢\006\006\032\004\b\025\020\rR\024\020\026\032\0020\0138VX\004¢\006\006\032\004\b\027\020\r\001\003¨\006/"}, d2 = {"Lorg/jetbrains/jewel/ui/component/ChipState;", "Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;", "Lorg/jetbrains/jewel/foundation/state/SelectableComponentState;", "state", "Lkotlin/ULong;", "constructor-impl", "(J)J", "getState-s-VKNKU", "()J", "J", "isActive", "", "isActive-impl", "(J)Z", "isEnabled", "isEnabled-impl", "isFocused", "isFocused-impl", "isSelected", "isSelected-impl", "isHovered", "isHovered-impl", "isPressed", "isPressed-impl", "copy", "enabled", "focused", "selected", "pressed", "hovered", "active", "copy-JT_Lw10", "(JZZZZZZ)J", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "equals", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "Companion", "ui"})
/*     */ @Immutable
/*     */ public final class ChipState
/*     */   implements FocusableComponentState, SelectableComponentState
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final long state;
/*     */   
/*     */   @Composable
/*     */   public static <T> T chooseValue-impl(long arg0, Object normal, Object disabled, Object focused, Object pressed, Object hovered, Object active, @Nullable Composer $composer, int $changed) {
/* 188 */     return box-impl(arg0).chooseValue((T)normal, (T)disabled, (T)focused, (T)pressed, (T)hovered, (T)active, $composer, $changed); } @Composable public <T> T chooseValue(Object normal, Object disabled, Object focused, Object pressed, Object hovered, Object active, @Nullable Composer $composer, int $changed) { return (T)FocusableComponentState.DefaultImpls.chooseValue(this, normal, disabled, focused, pressed, hovered, active, $composer, $changed); }
/*     */    public final long getState-s-VKNKU() {
/* 190 */     return this.state;
/*     */   }
/* 192 */   public static boolean isActive-impl(long arg0) { return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getActive-s-VKNKU()) != 0L); } public boolean isActive() { return isActive-impl(this.state); }
/*     */ 
/*     */   
/* 195 */   public static boolean isEnabled-impl(long arg0) { return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getEnabled-s-VKNKU()) != 0L); } public boolean isEnabled() { return isEnabled-impl(this.state); }
/*     */ 
/*     */   
/* 198 */   public static boolean isFocused-impl(long arg0) { return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getFocused-s-VKNKU()) != 0L); } public boolean isFocused() { return isFocused-impl(this.state); }
/*     */ 
/*     */   
/* 201 */   public static boolean isSelected-impl(long arg0) { return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getSelected-s-VKNKU()) != 0L); } public boolean isSelected() { return isSelected-impl(this.state); }
/*     */ 
/*     */   
/* 204 */   public static boolean isHovered-impl(long arg0) { return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getHovered-s-VKNKU()) != 0L); } public boolean isHovered() { return isHovered-impl(this.state); }
/*     */ 
/*     */   
/* 207 */   public static boolean isPressed-impl(long arg0) { return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getPressed-s-VKNKU()) != 0L); } public boolean isPressed() { return isPressed-impl(this.state); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final long copy-JT_Lw10(long arg0, boolean enabled, boolean focused, boolean selected, boolean pressed, boolean hovered, boolean active) {
/* 217 */     return Companion.of-JT_Lw10(
/* 218 */         enabled, 
/* 219 */         focused, 
/*     */ 
/*     */ 
/*     */         
/* 223 */         selected, pressed, hovered, active);
/*     */   }
/*     */   public static int hashCode-impl(long arg0) { return ULong.hashCode-impl(arg0); } public int hashCode() { return hashCode-impl(this.state); } @NotNull
/* 226 */   public String toString() { return toString-impl(this.state); }
/* 227 */   public static boolean equals-impl(long arg0, Object other) { if (!(other instanceof ChipState)) return false;  long l = ((ChipState)other).unbox-impl(); return !(arg0 != l); } @NotNull public static String toString-impl(long arg0) { return "ChipState(isEnabled=" + isEnabled-impl(arg0) + ", isFocused=" + isFocused-impl(arg0) + ", isSelected=" + isSelected-impl(arg0) + ", isHovered=" + 
/* 228 */       isHovered-impl(arg0) + ", isPressed=" + isPressed-impl(arg0) + ", isActive=" + isActive-impl(arg0) + ")"; }
/*     */    public boolean equals(Object other) {
/*     */     return equals-impl(this.state, other);
/*     */   } public static long constructor-impl(long state) {
/*     */     return state;
/*     */   }
/*     */   public static final boolean equals-impl0(long p1, long p2) {
/*     */     return ULong.equals-impl0(p1, p2);
/*     */   }
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\002\b\b\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003JI\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\0072\b\b\002\020\n\032\0020\0072\b\b\002\020\013\032\0020\0072\b\b\002\020\f\032\0020\007¢\006\004\b\r\020\016¨\006\017"}, d2 = {"Lorg/jetbrains/jewel/ui/component/ChipState$Companion;", "", "<init>", "()V", "of", "Lorg/jetbrains/jewel/ui/component/ChipState;", "enabled", "", "focused", "selected", "pressed", "hovered", "active", "of-JT_Lw10", "(ZZZZZZ)J", "ui"})
/*     */   public static final class Companion { public final long of-JT_Lw10(boolean enabled, boolean focused, boolean selected, boolean pressed, boolean hovered, boolean active) {
/* 239 */       return ChipState.constructor-impl(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 245 */           ULong.constructor-impl(ULong.constructor-impl(ULong.constructor-impl(ULong.constructor-impl(ULong.constructor-impl((enabled ? CommonStateBitMask.INSTANCE.getEnabled-s-VKNKU() : 0L) | (focused ? CommonStateBitMask.INSTANCE.getFocused-s-VKNKU() : 0L)) | (selected ? CommonStateBitMask.INSTANCE.getSelected-s-VKNKU() : 0L)) | (hovered ? CommonStateBitMask.INSTANCE.getHovered-s-VKNKU() : 0L)) | (pressed ? CommonStateBitMask.INSTANCE.getPressed-s-VKNKU() : 0L)) | (active ? CommonStateBitMask.INSTANCE.getActive-s-VKNKU() : 0L)));
/*     */     }
/*     */     
/*     */     private Companion() {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ChipState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */