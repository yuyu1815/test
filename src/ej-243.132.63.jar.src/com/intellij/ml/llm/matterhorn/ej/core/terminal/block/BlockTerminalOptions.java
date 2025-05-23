/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptStyle;
/*    */ import com.intellij.openapi.Disposable;
/*    */ import com.intellij.openapi.application.ApplicationManager;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.plugins.terminal.TerminalOptionsProvider;
/*    */ 
/*    */ @Service
/*    */ @State(name = "BlockTerminalOptions-matterhorn", storages = {@Storage(value = "terminal-matterhorn.xml", roamingType = RoamingType.DISABLED)})
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020!\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\005\b\001\030\000 \0312\b\022\004\022\0020\0020\001:\002\030\031B\007¢\006\004\b\003\020\004J\b\020\n\032\0020\002H\026J\020\020\013\032\0020\t2\006\020\005\032\0020\002H\026J\034\020\023\032\0020\t2\006\020\024\032\0020\0252\f\020\026\032\b\022\004\022\0020\t0\bJ\b\020\027\032\0020\tH\002R\016\020\005\032\0020\002X\016¢\006\002\n\000R\032\020\006\032\016\022\n\022\b\022\004\022\0020\t0\b0\007X\004¢\006\002\n\000R$\020\016\032\0020\r2\006\020\f\032\0020\r8F@FX\016¢\006\f\032\004\b\017\020\020\"\004\b\021\020\022¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalOptions;", "Lcom/intellij/openapi/components/PersistentStateComponent;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalOptions$State;", "<init>", "()V", "state", "listeners", "", "Lkotlin/Function0;", "", "getState", "loadState", "value", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptStyle;", "promptStyle", "getPromptStyle", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptStyle;", "setPromptStyle", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptStyle;)V", "addListener", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "listener", "fireSettingsChanged", "State", "Companion", "ej-core"})
/*    */ public final class BlockTerminalOptions implements PersistentStateComponent<BlockTerminalOptions.State> {
/*    */   @NotNull
/* 17 */   private State state = new State(); @NotNull public static final Companion Companion = new Companion(null); @NotNull
/* 18 */   private final List<Function0<Unit>> listeners = new CopyOnWriteArrayList<>(); @NotNull
/*    */   public State getState() {
/* 20 */     return this.state;
/*    */   }
/*    */   
/*    */   public void loadState(@NotNull State state) {
/* 24 */     Intrinsics.checkNotNullParameter(state, "state"); this.state = state;
/*    */ 
/*    */ 
/*    */     
/* 28 */     TerminalOptionsProvider options = TerminalOptionsProvider.Companion.getInstance();
/* 29 */     if (options.getUseShellPrompt()) {
/*    */       
/* 31 */       this.state.setPromptStyle(TerminalPromptStyle.SHELL);
/* 32 */       options.setUseShellPrompt(false);
/*    */     } 
/*    */   }
/*    */   @NotNull
/*    */   public final TerminalPromptStyle getPromptStyle() {
/* 37 */     return this.state.getPromptStyle();
/*    */   } public final void setPromptStyle(@NotNull TerminalPromptStyle value) {
/* 39 */     Intrinsics.checkNotNullParameter(value, "value"); if (this.state.getPromptStyle() != value) {
/* 40 */       this.state.setPromptStyle(value);
/* 41 */       fireSettingsChanged();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public final void addListener(@NotNull Disposable parentDisposable, @NotNull Function0 listener) {
/* 47 */     Intrinsics.checkNotNullParameter(parentDisposable, "parentDisposable"); Intrinsics.checkNotNullParameter(listener, "listener"); TerminalUtil.addItem(this.listeners, listener, parentDisposable);
/*    */   }
/*    */   
/*    */   private final void fireSettingsChanged() {
/* 51 */     for (Function0<Unit> listener : this.listeners)
/* 52 */       listener.invoke(); 
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\005\030\0002\0020\001B\007¢\006\004\b\002\020\003R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\006\020\007\"\004\b\b\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalOptions$State;", "", "<init>", "()V", "promptStyle", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptStyle;", "getPromptStyle", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptStyle;", "setPromptStyle", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptStyle;)V", "ej-core"})
/*    */   public static final class State { @NotNull
/* 57 */     private TerminalPromptStyle promptStyle = TerminalPromptStyle.DOUBLE_LINE; @NotNull public final TerminalPromptStyle getPromptStyle() { return this.promptStyle; } public final void setPromptStyle(@NotNull TerminalPromptStyle <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.promptStyle = <set-?>; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\b\020\004\032\0020\005H\007¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalOptions$Companion;", "", "<init>", "()V", "getInstance", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalOptions;", "ej-core"})
/*    */   @SourceDebugExtension({"SMAP\nBlockTerminalOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalOptions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalOptions$Companion\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,64:1\n40#2,3:65\n*S KotlinDebug\n*F\n+ 1 BlockTerminalOptions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalOptions$Companion\n*L\n62#1:65,3\n*E\n"})
/*    */   public static final class Companion { private Companion() {} @JvmStatic
/*    */     @NotNull
/*    */     public final BlockTerminalOptions getInstance() {
/* 62 */       int $i$f$service = 0;
/*    */ 
/*    */       
/* 65 */       Class<BlockTerminalOptions> serviceClass$iv = BlockTerminalOptions.class;
/* 66 */       if (ApplicationManager.getApplication().getService(serviceClass$iv) == null) { ApplicationManager.getApplication().getService(serviceClass$iv);
/* 67 */         throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ')'); }
/*    */       
/*    */       return (BlockTerminalOptions)ApplicationManager.getApplication().getService(serviceClass$iv);
/*    */     } }
/*    */ 
/*    */   
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   public static final BlockTerminalOptions getInstance() {
/*    */     return Companion.getInstance();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\BlockTerminalOptions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */