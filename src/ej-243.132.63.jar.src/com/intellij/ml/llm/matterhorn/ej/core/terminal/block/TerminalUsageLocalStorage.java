/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*    */ import java.util.Iterator;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Service
/*    */ @State(name = "BlockTerminalUsage", storages = {@Storage(value = "terminal.xml", roamingType = RoamingType.DISABLED)})
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020\002\n\002\b\b\b\001\030\000 \0262\b\022\004\022\0020\0020\001:\002\025\026B\007¢\006\004\b\003\020\004J\016\020\016\032\0020\0172\006\020\020\032\0020\013J\006\020\021\032\0020\017J\006\020\022\032\0020\017J\b\020\023\032\0020\002H\026J\020\020\024\032\0020\0172\006\020\005\032\0020\002H\026R\016\020\005\032\0020\002X\016¢\006\002\n\000R\021\020\006\032\0020\0078F¢\006\006\032\004\b\b\020\tR\023\020\n\032\004\030\0010\0138F¢\006\006\032\004\b\f\020\r¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalUsageLocalStorage;", "Lcom/intellij/openapi/components/PersistentStateComponent;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalUsageLocalStorage$State;", "<init>", "()V", "state", "executedCommandsNumber", "", "getExecutedCommandsNumber", "()I", "mostUsedShell", "", "getMostUsedShell", "()Ljava/lang/String;", "recordCommandExecuted", "", "shellName", "recordBlockTerminalUsed", "recordBlockTerminalDisabled", "getState", "loadState", "State", "Companion", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nTerminalUsageLocalStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalUsageLocalStorage.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalUsageLocalStorage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1971#2,14:58\n*S KotlinDebug\n*F\n+ 1 TerminalUsageLocalStorage.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalUsageLocalStorage\n*L\n21#1:58,14\n*E\n"})
/*    */ public final class TerminalUsageLocalStorage implements PersistentStateComponent<TerminalUsageLocalStorage.State> {
/*    */   @NotNull
/* 14 */   private State state = new State(); @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   public final int getExecutedCommandsNumber() {
/* 17 */     return CollectionsKt.sumOfInt(this.state.getShellToExecutedCommandsNumber().values());
/*    */   }
/*    */   @Nullable
/*    */   public final String getMostUsedShell() {
/* 21 */     Iterable<String> $this$maxByOrNull$iv = this.state.getShellToExecutedCommandsNumber().keySet(); int $i$f$maxByOrNull = 0;
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
/* 58 */     Iterator<String> iterator$iv = $this$maxByOrNull$iv.iterator();
/*    */     
/* 60 */     Object maxElem$iv = iterator$iv.next();
/* 61 */     if (!iterator$iv.hasNext()) {  }
/* 62 */     else { String it = (String)maxElem$iv; int $i$a$-maxByOrNull-TerminalUsageLocalStorage$mostUsedShell$1 = 0; Intrinsics.checkNotNull(this.state.getShellToExecutedCommandsNumber().get(it)); int maxValue$iv = this.state.getShellToExecutedCommandsNumber().get(it).intValue(); }
/*    */     
/*    */     return !iterator$iv.hasNext() ? null : "JD-Core does not support Kotlin";
/*    */   }
/*    */   
/*    */   public final void recordCommandExecuted(@NotNull String shellName) {
/*    */     Intrinsics.checkNotNullParameter(shellName, "shellName");
/*    */     Intrinsics.checkNotNullExpressionValue(shellName.toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*    */     this.state.getShellToExecutedCommandsNumber().merge(shellName.toLowerCase(Locale.ROOT), Integer.valueOf(1), TerminalUsageLocalStorage$recordCommandExecuted$1.INSTANCE::recordCommandExecuted$lambda$1);
/*    */   }
/*    */   
/*    */   private static final Integer recordCommandExecuted$lambda$1(Function2 $tmp0, Object p0, Object p1) {
/*    */     return (Integer)$tmp0.invoke(p0, p1);
/*    */   }
/*    */   
/*    */   public final void recordBlockTerminalUsed() {
/*    */     Intrinsics.checkNotNullExpressionValue(ApplicationInfo.getInstance().getBuild().asStringWithoutProductCodeAndSnapshot(), "asStringWithoutProductCodeAndSnapshot(...)");
/*    */     String curVersionString = ApplicationInfo.getInstance().getBuild().asStringWithoutProductCodeAndSnapshot();
/*    */     this.state.setBlockTerminalUsedLastVersion(curVersionString);
/*    */     this.state.setBlockTerminalUsedLastTimeMillis(System.currentTimeMillis());
/*    */   }
/*    */   
/*    */   public final void recordBlockTerminalDisabled() {
/*    */     this.state.setBlockTerminalDisabledLastTimeMillis(System.currentTimeMillis());
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public State getState() {
/*    */     return this.state;
/*    */   }
/*    */   
/*    */   public void loadState(@NotNull State state) {
/*    */     Intrinsics.checkNotNullParameter(state, "state");
/*    */     this.state = state;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020%\n\002\020\016\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\n\n\002\020\t\n\002\b\b\030\0002\0020\001B\007¢\006\004\b\002\020\003R\037\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\0058G¢\006\b\n\000\032\004\b\b\020\tR\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017R\034\020\020\032\004\030\0010\006X\016¢\006\016\n\000\032\004\b\021\020\022\"\004\b\023\020\024R\032\020\025\032\0020\026X\016¢\006\016\n\000\032\004\b\027\020\030\"\004\b\031\020\032R\032\020\033\032\0020\026X\016¢\006\016\n\000\032\004\b\034\020\030\"\004\b\035\020\032¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalUsageLocalStorage$State;", "", "<init>", "()V", "shellToExecutedCommandsNumber", "", "", "", "getShellToExecutedCommandsNumber", "()Ljava/util/Map;", "feedbackNotificationShown", "", "getFeedbackNotificationShown", "()Z", "setFeedbackNotificationShown", "(Z)V", "blockTerminalUsedLastVersion", "getBlockTerminalUsedLastVersion", "()Ljava/lang/String;", "setBlockTerminalUsedLastVersion", "(Ljava/lang/String;)V", "blockTerminalUsedLastTimeMillis", "", "getBlockTerminalUsedLastTimeMillis", "()J", "setBlockTerminalUsedLastTimeMillis", "(J)V", "blockTerminalDisabledLastTimeMillis", "getBlockTerminalDisabledLastTimeMillis", "setBlockTerminalDisabledLastTimeMillis", "ej-core"})
/*    */   public static final class State {
/*    */     @XMap
/*    */     @NotNull
/*    */     public final Map<String, Integer> getShellToExecutedCommandsNumber() {
/*    */       return this.shellToExecutedCommandsNumber;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     private final Map<String, Integer> shellToExecutedCommandsNumber = new HashMap<>();
/*    */     private boolean feedbackNotificationShown;
/*    */     @Nullable
/*    */     private String blockTerminalUsedLastVersion;
/*    */     private long blockTerminalUsedLastTimeMillis;
/*    */     private long blockTerminalDisabledLastTimeMillis;
/*    */     
/*    */     public final boolean getFeedbackNotificationShown() {
/*    */       return this.feedbackNotificationShown;
/*    */     }
/*    */     
/*    */     public final void setFeedbackNotificationShown(boolean <set-?>) {
/*    */       this.feedbackNotificationShown = <set-?>;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final String getBlockTerminalUsedLastVersion() {
/*    */       return this.blockTerminalUsedLastVersion;
/*    */     }
/*    */     
/*    */     public final void setBlockTerminalUsedLastVersion(@Nullable String <set-?>) {
/*    */       this.blockTerminalUsedLastVersion = <set-?>;
/*    */     }
/*    */     
/*    */     public final long getBlockTerminalUsedLastTimeMillis() {
/*    */       return this.blockTerminalUsedLastTimeMillis;
/*    */     }
/*    */     
/*    */     public final void setBlockTerminalUsedLastTimeMillis(long <set-?>) {
/*    */       this.blockTerminalUsedLastTimeMillis = <set-?>;
/*    */     }
/*    */     
/*    */     public final long getBlockTerminalDisabledLastTimeMillis() {
/*    */       return this.blockTerminalDisabledLastTimeMillis;
/*    */     }
/*    */     
/*    */     public final void setBlockTerminalDisabledLastTimeMillis(long <set-?>) {
/*    */       this.blockTerminalDisabledLastTimeMillis = <set-?>;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\b\020\004\032\0020\005H\007¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalUsageLocalStorage$Companion;", "", "<init>", "()V", "getInstance", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalUsageLocalStorage;", "ej-core"})
/*    */   @SourceDebugExtension({"SMAP\nTerminalUsageLocalStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalUsageLocalStorage.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalUsageLocalStorage$Companion\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,57:1\n40#2,3:58\n*S KotlinDebug\n*F\n+ 1 TerminalUsageLocalStorage.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalUsageLocalStorage$Companion\n*L\n54#1:58,3\n*E\n"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @JvmStatic
/*    */     @NotNull
/*    */     public final TerminalUsageLocalStorage getInstance() {
/*    */       int $i$f$service = 0;
/*    */       Class<TerminalUsageLocalStorage> serviceClass$iv = TerminalUsageLocalStorage.class;
/*    */       if (ApplicationManager.getApplication().getService(serviceClass$iv) == null) {
/*    */         ApplicationManager.getApplication().getService(serviceClass$iv);
/*    */         throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ')');
/*    */       } 
/*    */       return (TerminalUsageLocalStorage)ApplicationManager.getApplication().getService(serviceClass$iv);
/*    */     }
/*    */   }
/*    */   
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   public static final TerminalUsageLocalStorage getInstance() {
/*    */     return Companion.getInstance();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\TerminalUsageLocalStorage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */