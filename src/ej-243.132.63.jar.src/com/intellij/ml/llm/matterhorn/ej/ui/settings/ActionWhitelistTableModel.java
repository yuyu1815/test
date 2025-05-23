/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.settings;
/*    */ import com.intellij.ml.llm.matterhorn.ActionType;
/*    */ import com.intellij.ml.llm.matterhorn.settings.ActionRule;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020!\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\b\007\030\000 \0352\0020\0012\0020\002:\001\035B\025\022\f\020\003\032\b\022\004\022\0020\0050\004¢\006\004\b\006\020\007J\b\020\b\032\0020\tH\026J\b\020\n\032\0020\tH\026J\020\020\013\032\0020\f2\006\020\r\032\0020\tH\026J\030\020\016\032\n\022\006\b\001\022\0020\0200\0172\006\020\r\032\0020\tH\026J \020\021\032\0020\0222\006\020\023\032\0020\0202\006\020\024\032\0020\t2\006\020\r\032\0020\tH\026J\030\020\025\032\0020\f2\006\020\024\032\0020\t2\006\020\r\032\0020\tH\026J\016\020\026\032\0020\0222\006\020\027\032\0020\030J\020\020\031\032\0020\0222\006\020\032\032\0020\tH\026J\030\020\033\032\0020\0342\006\020\024\032\0020\t2\006\020\r\032\0020\tH\026R\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/ActionWhitelistTableModel;", "Ljavax/swing/table/AbstractTableModel;", "Lcom/intellij/util/ui/ItemRemovable;", "actionRules", "", "Lcom/intellij/ml/llm/matterhorn/settings/ActionRule;", "<init>", "(Ljava/util/List;)V", "getRowCount", "", "getColumnCount", "getColumnName", "", "column", "getColumnClass", "Ljava/lang/Class;", "", "setValueAt", "", "value", "row", "getValueAt", "addRow", "type", "Lcom/intellij/ml/llm/matterhorn/ActionType;", "removeRow", "idx", "isCellEditable", "", "Companion", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class ActionWhitelistTableModel extends AbstractTableModel implements ItemRemovable {
/*    */   public ActionWhitelistTableModel(@NotNull List<ActionRule> actionRules) {
/* 10 */     this.actionRules = actionRules;
/*    */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\002\n\002\020 \n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\024\020\007\032\b\022\004\022\0020\t0\bX\004¢\006\002\n\000¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/ActionWhitelistTableModel$Companion;", "", "<init>", "()V", "ACTION_TYPE_COLUMN", "", "ACTION_COLUMN", "myColumnNames", "", "", "ej-ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {} } @NotNull
/* 14 */   public static final Companion Companion = new Companion(null); @NotNull private final List<ActionRule> actionRules; public static final int $stable = 8; public static final int ACTION_TYPE_COLUMN = 0; public static final int ACTION_COLUMN = 1; @NotNull
/* 15 */   private static final List<String> myColumnNames; static { String[] arrayOfString = new String[2]; arrayOfString[0] = MatterhornBundle.message("junie.configurable.whitelist.action.type", new Object[0]); arrayOfString[1] = 
/* 16 */       MatterhornBundle.message("junie.configurable.whitelist.command", new Object[0]);
/*    */     myColumnNames = CollectionsKt.listOf((Object[])arrayOfString); }
/*    */   
/*    */   public int getRowCount() {
/* 20 */     return this.actionRules.size();
/*    */   }
/* 22 */   public int getColumnCount() { return myColumnNames.size(); }
/*    */   @NotNull
/* 24 */   public String getColumnName(int column) { return myColumnNames.get(column); } @NotNull
/*    */   public Class<? extends Object> getColumnClass(int column) {
/* 26 */     switch (column) { case 0:
/*    */       
/*    */       case 1:
/* 29 */        }  throw new IllegalArgumentException();
/*    */   }
/*    */   public void setValueAt(@NotNull Object value, int row, int column) {
/* 32 */     Intrinsics.checkNotNullParameter(value, "value"); switch (column) { case 0:
/* 33 */         this.actionRules.set(row, ActionRule.copy$default(this.actionRules.get(row), (ActionType)value, null, 2, null)); return;
/* 34 */       case 1: this.actionRules.set(row, ActionRule.copy$default(this.actionRules.get(row), null, StringsKt.trim((CharSequence)value).toString(), 1, null)); return; }
/* 35 */      throw new IllegalArgumentException();
/*    */   } @NotNull
/*    */   public String getValueAt(int row, int column) {
/* 38 */     switch (column) { case 0:
/*    */       
/*    */       case 1:
/* 41 */        }  throw new IllegalArgumentException();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final void addRow(@NotNull ActionType type) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'type'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: getstatic com/intellij/ml/llm/matterhorn/ej/ui/settings/ActionWhitelistTableModel$WhenMappings.$EnumSwitchMapping$0 : [I
/*    */     //   10: swap
/*    */     //   11: invokevirtual ordinal : ()I
/*    */     //   14: iaload
/*    */     //   15: tableswitch default -> 68, 1 -> 40, 2 -> 55, 3 -> 55
/*    */     //   40: new com/intellij/ml/llm/matterhorn/settings/ActionRule
/*    */     //   43: dup
/*    */     //   44: getstatic com/intellij/ml/llm/matterhorn/ActionType.Terminal : Lcom/intellij/ml/llm/matterhorn/ActionType;
/*    */     //   47: ldc ''
/*    */     //   49: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ActionType;Ljava/lang/String;)V
/*    */     //   52: goto -> 76
/*    */     //   55: new com/intellij/ml/llm/matterhorn/settings/ActionRule
/*    */     //   58: dup
/*    */     //   59: aload_1
/*    */     //   60: ldc '*'
/*    */     //   62: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ActionType;Ljava/lang/String;)V
/*    */     //   65: goto -> 76
/*    */     //   68: new kotlin/NoWhenBranchMatchedException
/*    */     //   71: dup
/*    */     //   72: invokespecial <init> : ()V
/*    */     //   75: athrow
/*    */     //   76: astore_2
/*    */     //   77: aload_2
/*    */     //   78: invokevirtual getActionType : ()Lcom/intellij/ml/llm/matterhorn/ActionType;
/*    */     //   81: getstatic com/intellij/ml/llm/matterhorn/ActionType.Terminal : Lcom/intellij/ml/llm/matterhorn/ActionType;
/*    */     //   84: if_acmpeq -> 100
/*    */     //   87: aload_0
/*    */     //   88: getfield actionRules : Ljava/util/List;
/*    */     //   91: aload_2
/*    */     //   92: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */     //   97: ifne -> 111
/*    */     //   100: aload_0
/*    */     //   101: getfield actionRules : Ljava/util/List;
/*    */     //   104: aload_2
/*    */     //   105: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   110: pop
/*    */     //   111: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #45	-> 6
/*    */     //   #46	-> 40
/*    */     //   #47	-> 55
/*    */     //   #45	-> 68
/*    */     //   #49	-> 77
/*    */     //   #50	-> 100
/*    */     //   #52	-> 111
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   77	35	2	rule	Lcom/intellij/ml/llm/matterhorn/settings/ActionRule;
/*    */     //   0	112	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/ActionWhitelistTableModel;
/*    */     //   0	112	1	type	Lcom/intellij/ml/llm/matterhorn/ActionType;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void removeRow(int idx) {
/* 55 */     if (idx < 0 || idx >= this.actionRules.size())
/* 56 */       return;  this.actionRules.remove(idx);
/* 57 */     fireTableRowsDeleted(idx, idx);
/*    */   }
/*    */   public boolean isCellEditable(int row, int column) {
/* 60 */     return 
/* 61 */       (WhenMappings.$EnumSwitchMapping$0[((ActionRule)this.actionRules.get(row)).getActionType().ordinal()] == 1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\settings\ActionWhitelistTableModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */