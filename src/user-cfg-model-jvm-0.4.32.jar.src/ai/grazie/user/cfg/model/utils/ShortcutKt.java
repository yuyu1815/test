/*    */ package ai.grazie.user.cfg.model.utils;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\032%\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\0042\n\b\002\020\005\032\004\030\0010\004¢\006\002\020\006*\n\020\007\"\0020\b2\0020\b*\n\020\t\"\0020\b2\0020\b¨\006\n"}, d2 = {"createShortcutsForMacWithCtrlIfNeeded", "", "Lai/grazie/user/cfg/model/utils/Shortcut;", "firstStroke", "Lai/grazie/user/cfg/model/utils/Keystroke;", "secondStroke", "(Lai/grazie/user/cfg/model/utils/Keystroke;Lai/grazie/user/cfg/model/utils/Keystroke;)[Lai/grazie/user/cfg/model/utils/Shortcut;", "Modifier", "", "OS", "user-cfg-model"})
/*    */ @SourceDebugExtension({"SMAP\nShortcut.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shortcut.kt\nai/grazie/user/cfg/model/utils/ShortcutKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
/*    */ public final class ShortcutKt
/*    */ {
/*    */   private static final Keystroke createShortcutsForMacWithCtrlIfNeeded$toMacCtrlCmd(Keystroke $this$createShortcutsForMacWithCtrlIfNeeded_u24toMacCtrlCmd) {
/* 68 */     if ($this$createShortcutsForMacWithCtrlIfNeeded_u24toMacCtrlCmd.getCtrl()) {
/* 69 */       if (!(!$this$createShortcutsForMacWithCtrlIfNeeded_u24toMacCtrlCmd.getMeta() ? 1 : 0)) {
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
/* 85 */         int $i$a$-require-ShortcutKt$createShortcutsForMacWithCtrlIfNeeded$toMacCtrlCmd$1 = 0;
/*    */         String str = "Can't create keystroke for Mac because meta modifier already present in origin keystroke";
/*    */         throw new IllegalArgumentException(str.toString());
/*    */       } 
/*    */       return new Keystroke($this$createShortcutsForMacWithCtrlIfNeeded_u24toMacCtrlCmd.getKey(), $this$createShortcutsForMacWithCtrlIfNeeded_u24toMacCtrlCmd.getModifiers() & 0xFFFFFFFB | 0x10);
/*    */     } 
/*    */     return $this$createShortcutsForMacWithCtrlIfNeeded_u24toMacCtrlCmd;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Shortcut[] createShortcutsForMacWithCtrlIfNeeded(@NotNull Keystroke firstStroke, @Nullable Keystroke secondStroke) {
/*    */     Intrinsics.checkNotNullParameter(firstStroke, "firstStroke");
/*    */     if (firstStroke.getCtrl() || (secondStroke != null && secondStroke.getCtrl())) {
/*    */       Shortcut[] arrayOfShortcut1 = new Shortcut[2];
/*    */       arrayOfShortcut1[0] = new Shortcut(firstStroke, secondStroke, 12);
/*    */       arrayOfShortcut1[1] = new Shortcut(createShortcutsForMacWithCtrlIfNeeded$toMacCtrlCmd(firstStroke), (secondStroke != null) ? createShortcutsForMacWithCtrlIfNeeded$toMacCtrlCmd(secondStroke) : null, 2);
/*    */       return arrayOfShortcut1;
/*    */     } 
/*    */     Shortcut[] arrayOfShortcut = new Shortcut[1];
/*    */     arrayOfShortcut[0] = new Shortcut(firstStroke, secondStroke, 0, 4, null);
/*    */     return arrayOfShortcut;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-cfg-model-jvm-0.4.32.jar!\ai\grazi\\user\cfg\mode\\utils\ShortcutKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */