/*    */ package org.jetbrains.jewel.foundation.lazy;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*    */ import androidx.compose.ui.input.pointer.PointerEvent_skikoKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\b\027\030\000 \f2\0020\001:\001\fB\007¢\006\004\b\002\020\003R\030\020\004\032\0020\005*\0020\0068VX\004¢\006\006\032\004\b\007\020\bR\030\020\004\032\0020\005*\0020\t8VX\004¢\006\006\032\004\b\n\020\013¨\006\r"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/DefaultMacOsSelectableColumnKeybindings;", "Lorg/jetbrains/jewel/foundation/lazy/DefaultSelectableColumnKeybindings;", "<init>", "()V", "isMultiSelectionKeyPressed", "", "Landroidx/compose/ui/input/key/KeyEvent;", "isMultiSelectionKeyPressed-ZmokQxo", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "isMultiSelectionKeyPressed-5xRPYO0", "(I)Z", "Companion", "foundation"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public class DefaultMacOsSelectableColumnKeybindings
/*    */   extends DefaultSelectableColumnKeybindings
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   public static final int $stable;
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/DefaultMacOsSelectableColumnKeybindings$Companion;", "Lorg/jetbrains/jewel/foundation/lazy/DefaultMacOsSelectableColumnKeybindings;", "<init>", "()V", "foundation"})
/*    */   public static final class Companion
/*    */     extends DefaultMacOsSelectableColumnKeybindings
/*    */   {
/*    */     private Companion() {}
/*    */   }
/*    */   
/*    */   public boolean isMultiSelectionKeyPressed-ZmokQxo(@NotNull Object $this$isMultiSelectionKeyPressed) {
/* 70 */     Intrinsics.checkNotNullParameter($this$isMultiSelectionKeyPressed, "$this$isMultiSelectionKeyPressed"); return KeyEvent_desktopKt.isMetaPressed-ZmokQxo($this$isMultiSelectionKeyPressed);
/*    */   }
/*    */   public boolean isMultiSelectionKeyPressed-5xRPYO0(int $this$isMultiSelectionKeyPressed) {
/* 73 */     return PointerEvent_skikoKt.isMetaPressed-5xRPYO0($this$isMultiSelectionKeyPressed);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\DefaultMacOsSelectableColumnKeybindings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */