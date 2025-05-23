/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.settings;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.lang.Language;
/*     */ import com.intellij.ml.llm.matterhorn.ActionType;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.MatterhornBundle;
/*     */ import com.intellij.ml.llm.matterhorn.settings.ActionRule;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornModelPersistentStateComponent;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.actionSystem.DefaultActionGroup;
/*     */ import com.intellij.openapi.project.DumbAwareAction;
/*     */ import com.intellij.openapi.ui.DialogPanel;
/*     */ import com.intellij.ui.LanguageTextField;
/*     */ import com.intellij.ui.ToolbarDecorator;
/*     */ import com.intellij.ui.dsl.builder.Row;
/*     */ import java.awt.Component;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.table.TableColumn;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.intellij.lang.regexp.RegExpLanguage;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\003\n\002\020\013\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020!\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\b\007\030\000 #2\0020\001:\006#$%&'(B\007¢\006\004\b\002\020\003J\b\020\f\032\0020\rH\026J\b\020\016\032\0020\rH\026J\b\020\017\032\0020\007H\026J\b\020\020\032\0020\021H\026J\b\020\022\032\0020\023H\026J\b\020\024\032\0020\023H\026J\b\020\025\032\0020\026H\002J\020\020\027\032\0020\0232\006\020\030\032\0020\031H\002J\b\020\032\032\0020\023H\002J\026\020\033\032\0020\0232\f\020\034\032\b\022\004\022\0020\0360\035H\002J\024\020\037\032\0020 *\0020\0312\006\020!\032\0020\"H\002R\016\020\004\032\0020\005X.¢\006\002\n\000R\033\020\006\032\0020\0078BX\002¢\006\f\n\004\b\n\020\013\032\004\b\b\020\t¨\006)"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable;", "Lcom/intellij/openapi/options/SearchableConfigurable;", "<init>", "()V", "whiteListTable", "Lcom/intellij/ui/table/JBTable;", "panel", "Lcom/intellij/openapi/ui/DialogPanel;", "getPanel", "()Lcom/intellij/openapi/ui/DialogPanel;", "panel$delegate", "Lkotlin/Lazy;", "getId", "", "getDisplayName", "createComponent", "isModified", "", "apply", "", "reset", "createWhiteListPanel", "Ljavax/swing/JPanel;", "addRule", "actionType", "Lcom/intellij/ml/llm/matterhorn/ActionType;", "removeSelectedRule", "createCommandWhiteList", "whitelist", "", "Lcom/intellij/ml/llm/matterhorn/settings/ActionRule;", "getRuleAction", "Lcom/intellij/openapi/project/DumbAwareAction;", "model", "Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/ActionWhitelistTableModel;", "Companion", "ActionCellRenderer", "ActionCellEditor", "AddTerminalRuleAction", "AddTestRuleAction", "AddBuildRuleAction", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nJunieAllowlistSettingsConfigurable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieAllowlistSettingsConfigurable.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,197:1\n774#2:198\n865#2,2:199\n1557#2:201\n1628#2,3:202\n31#3,2:205\n*S KotlinDebug\n*F\n+ 1 JunieAllowlistSettingsConfigurable.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable\n*L\n92#1:198\n92#1:199,2\n92#1:201\n92#1:202,3\n41#1:205,2\n*E\n"})
/*     */ public final class JunieAllowlistSettingsConfigurable implements SearchableConfigurable {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*  40 */   private final Lazy panel$delegate = LazyKt.lazy(this::panel_delegate$lambda$7); private JBTable whiteListTable; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable$Companion;", "", "<init>", "()V", "MIN_TABLE_HEIGHT", "", "MAX_ACTION_TYPE_WIDTH", "ej-ui"}) public static final class Companion { private Companion() {} } public static final int $stable = 8; public static final int MIN_TABLE_HEIGHT = 200; public static final int MAX_ACTION_TYPE_WIDTH = 120; private final DialogPanel getPanel() { Lazy lazy = this.panel$delegate; return (DialogPanel)lazy.getValue(); }
/*     */    private static final DialogPanel panel_delegate$lambda$7(JunieAllowlistSettingsConfigurable this$0) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   3: checkcast com/intellij/openapi/components/ComponentManager
/*     */     //   6: astore_2
/*     */     //   7: iconst_0
/*     */     //   8: istore_3
/*     */     //   9: ldc_w com/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent
/*     */     //   12: astore #4
/*     */     //   14: aload_2
/*     */     //   15: aload #4
/*     */     //   17: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   22: dup
/*     */     //   23: ifnonnull -> 34
/*     */     //   26: pop
/*     */     //   27: aload_2
/*     */     //   28: aload #4
/*     */     //   30: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*     */     //   33: athrow
/*     */     //   34: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent
/*     */     //   37: astore_1
/*     */     //   38: aload_1
/*     */     //   39: invokevirtual getActionWhiteList : ()Ljava/util/List;
/*     */     //   42: checkcast java/util/Collection
/*     */     //   45: invokestatic toMutableList : (Ljava/util/Collection;)Ljava/util/List;
/*     */     //   48: astore_2
/*     */     //   49: aload_0
/*     */     //   50: aload_2
/*     */     //   51: invokespecial createCommandWhiteList : (Ljava/util/List;)V
/*     */     //   54: aload_0
/*     */     //   55: invokespecial createWhiteListPanel : ()Ljavax/swing/JPanel;
/*     */     //   58: astore_3
/*     */     //   59: aload_3
/*     */     //   60: aload_1
/*     */     //   61: aload_2
/*     */     //   62: aload_0
/*     */     //   63: <illegal opcode> invoke : (Ljavax/swing/JPanel;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable;)Lkotlin/jvm/functions/Function1;
/*     */     //   68: invokestatic panel : (Lkotlin/jvm/functions/Function1;)Lcom/intellij/openapi/ui/DialogPanel;
/*     */     //   71: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #41	-> 0
/*     */     //   #205	-> 9
/*     */     //   #206	-> 14
/*     */     //   #41	-> 34
/*     */     //   #42	-> 38
/*     */     //   #43	-> 49
/*     */     //   #44	-> 54
/*     */     //   #45	-> 59
/*     */     //   #70	-> 71
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   9	25	3	$i$f$service	I
/*     */     //   14	20	4	serviceClass$iv	Ljava/lang/Class;
/*     */     //   7	27	2	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */     //   38	34	1	settings	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;
/*     */     //   49	23	2	whiteList	Ljava/util/List;
/*     */     //   59	13	3	panel	Ljavax/swing/JPanel;
/*     */     //   0	72	0	this$0	Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable;
/*     */   }
/*     */   private static final Unit panel_delegate$lambda$7$lambda$6(JPanel $panel, MatterhornModelPersistentStateComponent $settings, List $whiteList, JunieAllowlistSettingsConfigurable this$0, Panel $this$panel) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: ldc_w '$this$panel'
/*     */     //   5: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   8: aload #4
/*     */     //   10: aconst_null
/*     */     //   11: aload_0
/*     */     //   12: aload_1
/*     */     //   13: aload_2
/*     */     //   14: aload_3
/*     */     //   15: <illegal opcode> invoke : (Ljavax/swing/JPanel;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable;)Lkotlin/jvm/functions/Function1;
/*     */     //   20: iconst_1
/*     */     //   21: aconst_null
/*     */     //   22: invokestatic row$default : (Lcom/intellij/ui/dsl/builder/Panel;Ljavax/swing/JLabel;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/intellij/ui/dsl/builder/Row;
/*     */     //   25: getstatic com/intellij/ui/dsl/builder/TopGap.SMALL : Lcom/intellij/ui/dsl/builder/TopGap;
/*     */     //   28: invokeinterface topGap : (Lcom/intellij/ui/dsl/builder/TopGap;)Lcom/intellij/ui/dsl/builder/Row;
/*     */     //   33: getstatic com/intellij/ui/dsl/builder/BottomGap.SMALL : Lcom/intellij/ui/dsl/builder/BottomGap;
/*     */     //   36: invokeinterface bottomGap : (Lcom/intellij/ui/dsl/builder/BottomGap;)Lcom/intellij/ui/dsl/builder/Row;
/*     */     //   41: pop
/*     */     //   42: aload #4
/*     */     //   44: aconst_null
/*     */     //   45: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   50: iconst_1
/*     */     //   51: aconst_null
/*     */     //   52: invokestatic row$default : (Lcom/intellij/ui/dsl/builder/Panel;Ljavax/swing/JLabel;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/intellij/ui/dsl/builder/Row;
/*     */     //   55: pop
/*     */     //   56: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   59: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #46	-> 8
/*     */     //   #64	-> 25
/*     */     //   #65	-> 42
/*     */     //   #70	-> 56
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	60	0	$panel	Ljavax/swing/JPanel;
/*     */     //   0	60	1	$settings	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;
/*     */     //   0	60	2	$whiteList	Ljava/util/List;
/*     */     //   0	60	3	this$0	Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable;
/*     */     //   0	60	4	$this$panel	Lcom/intellij/ui/dsl/builder/Panel;
/*     */   }
/*     */   private static final Unit panel_delegate$lambda$7$lambda$6$lambda$3(JPanel $panel, MatterhornModelPersistentStateComponent $settings, List $whiteList, JunieAllowlistSettingsConfigurable this$0, Row $this$row) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: ldc_w '$this$row'
/*     */     //   5: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   8: aload #4
/*     */     //   10: aload_0
/*     */     //   11: checkcast javax/swing/JComponent
/*     */     //   14: invokeinterface cell : (Ljavax/swing/JComponent;)Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   19: ldc_w 'junie.configurable.whitelist.annotation'
/*     */     //   22: iconst_0
/*     */     //   23: anewarray java/lang/Object
/*     */     //   26: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   29: checkcast java/lang/CharSequence
/*     */     //   32: invokestatic wrapInHtml : (Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   35: dup
/*     */     //   36: ldc_w 'wrapInHtml(...)'
/*     */     //   39: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   42: getstatic com/intellij/ui/dsl/builder/LabelPosition.TOP : Lcom/intellij/ui/dsl/builder/LabelPosition;
/*     */     //   45: invokeinterface label : (Ljava/lang/String;Lcom/intellij/ui/dsl/builder/LabelPosition;)Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   50: getstatic com/intellij/ui/dsl/builder/AlignX$FILL.INSTANCE : Lcom/intellij/ui/dsl/builder/AlignX$FILL;
/*     */     //   53: checkcast com/intellij/ui/dsl/builder/Align
/*     */     //   56: invokeinterface align : (Lcom/intellij/ui/dsl/builder/Align;)Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   61: aload_1
/*     */     //   62: aload_2
/*     */     //   63: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;Ljava/util/List;)Lkotlin/jvm/functions/Function0;
/*     */     //   68: invokeinterface onApply : (Lkotlin/jvm/functions/Function0;)Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   73: aload_1
/*     */     //   74: aload_2
/*     */     //   75: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;Ljava/util/List;)Lkotlin/jvm/functions/Function0;
/*     */     //   80: invokeinterface onIsModified : (Lkotlin/jvm/functions/Function0;)Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   85: aload_3
/*     */     //   86: aload_2
/*     */     //   87: aload_1
/*     */     //   88: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;)Lkotlin/jvm/functions/Function0;
/*     */     //   93: invokeinterface onReset : (Lkotlin/jvm/functions/Function0;)Lcom/intellij/ui/dsl/builder/Cell;
/*     */     //   98: pop
/*     */     //   99: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   102: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #47	-> 8
/*     */     //   #48	-> 19
/*     */     //   #49	-> 50
/*     */     //   #50	-> 61
/*     */     //   #53	-> 73
/*     */     //   #56	-> 85
/*     */     //   #64	-> 99
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	103	0	$panel	Ljavax/swing/JPanel;
/*     */     //   0	103	1	$settings	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;
/*     */     //   0	103	2	$whiteList	Ljava/util/List;
/*     */     //   0	103	3	this$0	Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable;
/*     */     //   0	103	4	$this$row	Lcom/intellij/ui/dsl/builder/Row;
/*     */   }
/*     */   private static final Unit panel_delegate$lambda$7$lambda$6$lambda$3$lambda$0(MatterhornModelPersistentStateComponent $settings, List $whiteList) {
/*  51 */     $settings.setActionWhiteList($whiteList);
/*  52 */     return Unit.INSTANCE;
/*     */   } private static final boolean panel_delegate$lambda$7$lambda$6$lambda$3$lambda$1(MatterhornModelPersistentStateComponent $settings, List $whiteList) {
/*  54 */     return !Intrinsics.areEqual($settings.getActionWhiteList(), $whiteList);
/*     */   }
/*     */   private static final Unit panel_delegate$lambda$7$lambda$6$lambda$3$lambda$2(JunieAllowlistSettingsConfigurable this$0, List $whiteList, MatterhornModelPersistentStateComponent $settings) {
/*  57 */     if (this$0.whiteListTable == null) Intrinsics.throwUninitializedPropertyAccessException("whiteListTable");  if (null.isEditing()) {
/*  58 */       if (this$0.whiteListTable == null) Intrinsics.throwUninitializedPropertyAccessException("whiteListTable");  TableUtil.stopEditing((JTable)null);
/*     */     } 
/*  60 */     $whiteList.clear();
/*  61 */     $whiteList.addAll(CollectionsKt.toMutableList($settings.getActionWhiteList()));
/*  62 */     if (this$0.whiteListTable == null) Intrinsics.throwUninitializedPropertyAccessException("whiteListTable");  Intrinsics.checkNotNull(null.getModel(), "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.ui.settings.ActionWhitelistTableModel"); ((ActionWhitelistTableModel)null.getModel()).fireTableDataChanged();
/*  63 */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*  66 */   private static final Unit panel_delegate$lambda$7$lambda$6$lambda$5(Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.button(MatterhornBundle.message("junie.configurable.whitelist.check.command", new Object[0]), JunieAllowlistSettingsConfigurable::panel_delegate$lambda$7$lambda$6$lambda$5$lambda$4);
/*     */ 
/*     */     
/*  69 */     return Unit.INSTANCE; } private static final Unit panel_delegate$lambda$7$lambda$6$lambda$5$lambda$4(ActionEvent it) { Intrinsics.checkNotNullParameter(it, "it");
/*     */     (new CheckCommandDialog()).show();
/*     */     return Unit.INSTANCE; }
/*     */   @NotNull
/*  73 */   public String getId() { return "junie.allowlist"; }
/*     */   @NotNull
/*  75 */   public String getDisplayName() { return MatterhornBundle.message("junie.action.allowlist.configurable.name", new Object[0]); } @NotNull
/*     */   public DialogPanel createComponent() {
/*  77 */     return getPanel();
/*     */   } public boolean isModified() {
/*  79 */     return getPanel().isModified();
/*     */   }
/*     */   public void apply() {
/*  82 */     getPanel().apply();
/*     */   }
/*     */   
/*     */   public void reset() {
/*  86 */     getPanel().reset();
/*     */   }
/*     */   
/*     */   private final JPanel createWhiteListPanel() {
/*  90 */     if (this.whiteListTable == null) Intrinsics.throwUninitializedPropertyAccessException("whiteListTable");  Intrinsics.checkNotNull(null.getModel(), "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.ui.settings.ActionWhitelistTableModel"); ActionWhitelistTableModel model = (ActionWhitelistTableModel)null.getModel();
/*     */     
/*  92 */     Iterable $this$filter$iv = (Iterable)ActionType.getEntries(); int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 198 */     Iterable iterable1 = $this$filter$iv; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 199 */     for (Object element$iv$iv : iterable1) { ActionType it = (ActionType)element$iv$iv; int $i$a$-filter-JunieAllowlistSettingsConfigurable$createWhiteListPanel$addGroup$1 = 0; if (it.isWhitelistSupported()) collection.add(element$iv$iv);  }
/* 200 */      $this$filter$iv = collection; int $i$f$map = 0;
/* 201 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection<DumbAwareAction> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10)); int $i$f$mapTo = 0;
/* 202 */     for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 203 */       ActionType actionType = (ActionType)item$iv$iv; Collection<DumbAwareAction> collection1 = destination$iv$iv; int $i$a$-map-JunieAllowlistSettingsConfigurable$createWhiteListPanel$addGroup$2 = 0; collection1.add(getRuleAction(actionType, model));
/* 204 */     }  List list = (List)destination$iv$iv;
/*     */     DefaultActionGroup addGroup = new DefaultActionGroup(list);
/*     */     addGroup.getTemplatePresentation().setPopupGroup(true);
/*     */     addGroup.getTemplatePresentation().setIcon(AllIcons.General.Add);
/*     */     addGroup.getTemplatePresentation().setText(MatterhornBundle.message("junie.configurable.whitelist.add", new Object[0]));
/*     */     addGroup.registerCustomShortcutSet(CommonShortcuts.getNewForDialogs(), null);
/*     */     if (this.whiteListTable == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("whiteListTable"); 
/*     */     String[] arrayOfString = new String[2];
/*     */     arrayOfString[0] = MatterhornBundle.message("junie.configurable.whitelist.add", new Object[0]);
/*     */     arrayOfString[1] = MatterhornBundle.message("junie.configurable.whitelist.remove", new Object[0]);
/*     */     Intrinsics.checkNotNullExpressionValue(ToolbarDecorator.createDecorator((JTable)null).disableAddAction().addExtraAction((AnAction)addGroup).setRemoveAction(this::createWhiteListPanel$lambda$10).setButtonComparator(arrayOfString), "setButtonComparator(...)");
/*     */     ToolbarDecorator decorator = ToolbarDecorator.createDecorator((JTable)null).disableAddAction().addExtraAction((AnAction)addGroup).setRemoveAction(this::createWhiteListPanel$lambda$10).setButtonComparator(arrayOfString);
/*     */     Intrinsics.checkNotNullExpressionValue(decorator.createPanel(), "createPanel(...)");
/*     */     JPanel jPanel1 = decorator.createPanel(), $this$createWhiteListPanel_u24lambda_u2411 = jPanel1;
/*     */     int $i$a$-apply-JunieAllowlistSettingsConfigurable$createWhiteListPanel$1 = 0;
/*     */     $this$createWhiteListPanel_u24lambda_u2411.setPreferredSize(new Dimension(-1, 200));
/*     */     return jPanel1;
/*     */   }
/*     */   
/*     */   private static final void createWhiteListPanel$lambda$10(JunieAllowlistSettingsConfigurable this$0, AnActionButton it) {
/*     */     this$0.removeSelectedRule();
/*     */   }
/*     */   
/*     */   private final void addRule(ActionType actionType) {
/*     */     if (this.whiteListTable == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("whiteListTable"); 
/*     */     Intrinsics.checkNotNull(null.getModel(), "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.ui.settings.ActionWhitelistTableModel");
/*     */     ((ActionWhitelistTableModel)null.getModel()).addRow(actionType);
/*     */   }
/*     */   
/*     */   private final void removeSelectedRule() {
/*     */     if (this.whiteListTable == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("whiteListTable"); 
/*     */     int selectedRow = null.getSelectedRow();
/*     */     if (this.whiteListTable == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("whiteListTable"); 
/*     */     null.removeEditor();
/*     */     if (this.whiteListTable == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("whiteListTable"); 
/*     */     null.clearSelection();
/*     */     if (this.whiteListTable == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("whiteListTable"); 
/*     */     Intrinsics.checkNotNull(null.getModel(), "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.ui.settings.ActionWhitelistTableModel");
/*     */     ((ActionWhitelistTableModel)null.getModel()).removeRow(selectedRow);
/*     */   }
/*     */   
/*     */   private final void createCommandWhiteList(List<ActionRule> whitelist) {
/*     */     ActionWhitelistTableModel whitelistModel = new ActionWhitelistTableModel(whitelist);
/*     */     this.whiteListTable = new JBTable(whitelistModel);
/*     */     if (this.whiteListTable == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("whiteListTable"); 
/*     */     null.setSelectionMode(0);
/*     */     if (this.whiteListTable == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("whiteListTable"); 
/*     */     TableColumn actionTypeColumn = null.getColumnModel().getColumn(0);
/*     */     actionTypeColumn.setMinWidth(120);
/*     */     actionTypeColumn.setMaxWidth(120);
/*     */     if (this.whiteListTable == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("whiteListTable"); 
/*     */     TableColumn actionColumn = null.getColumnModel().getColumn(1);
/*     */     ActionCellRenderer actionCellRenderer = new ActionCellRenderer();
/*     */     ActionCellEditor actionCellEditor = new ActionCellEditor();
/*     */     actionColumn.setCellRenderer(actionCellRenderer);
/*     */     actionColumn.setCellEditor(actionCellEditor);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J>\020\n\032\004\030\0010\0132\b\020\f\032\004\030\0010\r2\b\020\016\032\004\030\0010\0172\006\020\020\032\0020\0212\006\020\022\032\0020\0212\006\020\023\032\0020\0242\006\020\025\032\0020\024H\026R\033\020\004\032\0020\0058BX\002¢\006\f\n\004\b\b\020\t\032\004\b\006\020\007¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable$ActionCellRenderer;", "Ljavax/swing/table/TableCellRenderer;", "<init>", "()V", "field", "Lcom/intellij/ui/LanguageTextField;", "getField", "()Lcom/intellij/ui/LanguageTextField;", "field$delegate", "Lkotlin/Lazy;", "getTableCellRendererComponent", "Ljava/awt/Component;", "table", "Ljavax/swing/JTable;", "value", "", "isSelected", "", "hasFocus", "row", "", "column", "ej-ui"})
/*     */   @StabilityInferred(parameters = 0)
/*     */   public static final class ActionCellRenderer implements TableCellRenderer {
/*     */     @NotNull
/*     */     private final Lazy field$delegate = LazyKt.lazy(ActionCellRenderer::field_delegate$lambda$0);
/*     */     public static final int $stable = 8;
/*     */     
/*     */     private final LanguageTextField getField() {
/*     */       Lazy lazy = this.field$delegate;
/*     */       return (LanguageTextField)lazy.getValue();
/*     */     }
/*     */     
/*     */     private static final LanguageTextField field_delegate$lambda$0() {
/*     */       return new LanguageTextField((Language)RegExpLanguage.INSTANCE, null, "");
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public Component getTableCellRendererComponent(@Nullable JTable table, @Nullable Object value, boolean isSelected, boolean hasFocus, int row, int column) {
/*     */       if (((value instanceof String) ? value : null) == null)
/*     */         (value instanceof String) ? value : null; 
/*     */       ((value instanceof String) ? value : null).setText("");
/*     */       return (Component)getField();
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\016\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\013\n\000\n\002\020\b\n\002\b\002\b\007\030\0002\0020\0012\0020\002B\007¢\006\004\b\003\020\004J\r\020\013\032\0070\f¢\006\002\b\rH\026J4\020\016\032\004\030\0010\0172\006\020\020\032\0020\0212\b\020\022\032\004\030\0010\0232\006\020\024\032\0020\0252\006\020\026\032\0020\0272\006\020\030\032\0020\027H\026R\033\020\005\032\0020\0068BX\002¢\006\f\n\004\b\t\020\n\032\004\b\007\020\b¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable$ActionCellEditor;", "Ljavax/swing/AbstractCellEditor;", "Ljavax/swing/table/TableCellEditor;", "<init>", "()V", "field", "Lcom/intellij/ui/LanguageTextField;", "getField", "()Lcom/intellij/ui/LanguageTextField;", "field$delegate", "Lkotlin/Lazy;", "getCellEditorValue", "", "Lorg/jetbrains/annotations/NotNull;", "getTableCellEditorComponent", "Ljava/awt/Component;", "table", "Ljavax/swing/JTable;", "value", "", "isSelected", "", "row", "", "column", "ej-ui"})
/*     */   @StabilityInferred(parameters = 0)
/*     */   public static final class ActionCellEditor extends AbstractCellEditor implements TableCellEditor {
/*     */     @NotNull
/*     */     private final Lazy field$delegate = LazyKt.lazy(ActionCellEditor::field_delegate$lambda$0);
/*     */     public static final int $stable = 8;
/*     */     
/*     */     private final LanguageTextField getField() {
/*     */       Lazy lazy = this.field$delegate;
/*     */       return (LanguageTextField)lazy.getValue();
/*     */     }
/*     */     
/*     */     private static final LanguageTextField field_delegate$lambda$0() {
/*     */       return new LanguageTextField((Language)RegExpLanguage.INSTANCE, null, "");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getCellEditorValue() {
/*     */       Intrinsics.checkNotNullExpressionValue(getField().getText(), "getText(...)");
/*     */       return getField().getText();
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public Component getTableCellEditorComponent(@NotNull JTable table, @Nullable Object value, boolean isSelected, int row, int column) {
/*     */       Intrinsics.checkNotNullParameter(table, "table");
/*     */       if (((value instanceof String) ? value : null) == null)
/*     */         (value instanceof String) ? value : null; 
/*     */       ((value instanceof String) ? value : null).setText("");
/*     */       return (Component)getField();
/*     */     }
/*     */   }
/*     */   
/*     */   private final DumbAwareAction getRuleAction(ActionType $this$getRuleAction, ActionWhitelistTableModel model) {
/*     */     switch (WhenMappings.$EnumSwitchMapping$0[$this$getRuleAction.ordinal()]) {
/*     */       case 1:
/*     */       
/*     */       case 2:
/*     */       
/*     */       case 3:
/*     */       
/*     */     } 
/*     */     throw new NoWhenBranchMatchedException();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\b\004\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable$AddTerminalRuleAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "model", "Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/ActionWhitelistTableModel;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable;Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/ActionWhitelistTableModel;)V", "getModel", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/ActionWhitelistTableModel;", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "ej-ui"})
/*     */   private final class AddTerminalRuleAction extends DumbAwareAction {
/*     */     @NotNull
/*     */     private final ActionWhitelistTableModel model;
/*     */     
/*     */     public AddTerminalRuleAction(ActionWhitelistTableModel model) {
/*     */       super(MatterhornBundle.message("junie.configurable.whitelist.add.terminal", new Object[0]));
/*     */       this.model = model;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ActionWhitelistTableModel getModel() {
/*     */       return this.model;
/*     */     }
/*     */     
/*     */     public void actionPerformed(@NotNull AnActionEvent e) {
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       JunieAllowlistSettingsConfigurable.this.addRule(ActionType.Terminal);
/*     */       this.model.fireTableDataChanged();
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\b\004\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable$AddTestRuleAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "model", "Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/ActionWhitelistTableModel;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable;Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/ActionWhitelistTableModel;)V", "getModel", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/ActionWhitelistTableModel;", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "ej-ui"})
/*     */   private final class AddTestRuleAction extends DumbAwareAction {
/*     */     @NotNull
/*     */     private final ActionWhitelistTableModel model;
/*     */     
/*     */     public AddTestRuleAction(ActionWhitelistTableModel model) {
/*     */       super(MatterhornBundle.message("junie.configurable.whitelist.add.runtest", new Object[0]));
/*     */       this.model = model;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ActionWhitelistTableModel getModel() {
/*     */       return this.model;
/*     */     }
/*     */     
/*     */     public void actionPerformed(@NotNull AnActionEvent e) {
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       JunieAllowlistSettingsConfigurable.this.addRule(ActionType.RunTests);
/*     */       this.model.fireTableDataChanged();
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\b\004\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable$AddBuildRuleAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "model", "Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/ActionWhitelistTableModel;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable;Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/ActionWhitelistTableModel;)V", "getModel", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/ActionWhitelistTableModel;", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "ej-ui"})
/*     */   private final class AddBuildRuleAction extends DumbAwareAction {
/*     */     @NotNull
/*     */     private final ActionWhitelistTableModel model;
/*     */     
/*     */     public AddBuildRuleAction(ActionWhitelistTableModel model) {
/*     */       super(MatterhornBundle.message("junie.configurable.whitelist.add.build", new Object[0]));
/*     */       this.model = model;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ActionWhitelistTableModel getModel() {
/*     */       return this.model;
/*     */     }
/*     */     
/*     */     public void actionPerformed(@NotNull AnActionEvent e) {
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       JunieAllowlistSettingsConfigurable.this.addRule(ActionType.Build);
/*     */       this.model.fireTableDataChanged();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\settings\JunieAllowlistSettingsConfigurable.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */