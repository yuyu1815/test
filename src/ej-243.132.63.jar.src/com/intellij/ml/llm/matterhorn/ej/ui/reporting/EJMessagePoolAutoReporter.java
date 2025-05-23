/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.reporting;
/*    */ 
/*    */ import com.intellij.diagnostic.AbstractMessage;
/*    */ import com.intellij.ide.plugins.IdeaPluginDescriptor;
/*    */ import com.intellij.openapi.diagnostic.ErrorReportSubmitter;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import com.intellij.openapi.extensions.PluginId;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Triple;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Service({Service.Level.APP})
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0262\0020\001:\002\026\027B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J6\020\006\032\0020\0072\036\020\b\032\032\022\004\022\0020\n\022\004\022\0020\013\022\006\022\004\030\0010\f0\tj\002`\r2\006\020\016\032\0020\017H@¢\006\002\020\020J\022\020\021\032\0020\0222\b\020\023\032\004\030\0010\024H\024J\020\020\025\032\0020\0222\006\020\b\032\0020\nH\026¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/reporting/EJMessagePoolAutoReporter;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter;", "cs", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "submit", "Lcom/intellij/openapi/diagnostic/SubmittedReportInfo;", "message", "Lkotlin/Triple;", "Lcom/intellij/diagnostic/AbstractMessage;", "Lcom/intellij/diagnostic/ITNReporter;", "Lcom/intellij/ide/plugins/IdeaPluginDescriptor;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/reporting/EJMessageReport;", "stacktrace", "", "(Lkotlin/Triple;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkSubmitter", "", "submitter", "Lcom/intellij/openapi/diagnostic/ErrorReportSubmitter;", "newEntryConsumed", "Companion", "EJLoggingEvent", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ @SourceDebugExtension({"SMAP\nEJMessagePoolAutoReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EJMessagePoolAutoReporter.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/reporting/EJMessagePoolAutoReporter\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,51:1\n14#2:52\n*S KotlinDebug\n*F\n+ 1 EJMessagePoolAutoReporter.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/reporting/EJMessagePoolAutoReporter\n*L\n22#1:52\n*E\n"})
/*    */ public final class EJMessagePoolAutoReporter extends AbstractEJMessagePoolAutoReporter {
/* 19 */   public EJMessagePoolAutoReporter(@NotNull CoroutineScope cs) { super(cs); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/reporting/EJMessagePoolAutoReporter$Companion;", "", "<init>", "()V", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "getLOG", "()Lcom/intellij/openapi/diagnostic/Logger;", "ej-ui"})
/*    */   public static final class Companion { private Companion() {}
/*    */     @NotNull
/* 22 */     public final Logger getLOG() { return EJMessagePoolAutoReporter.LOG; } } @NotNull public static final Companion Companion = new Companion(null); public static final int $stable; static { int $i$f$logger = 0;
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
/* 52 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(EJMessagePoolAutoReporter.class), "getInstance(...)"); } @Nullable protected Object submit(@NotNull Triple message, @NotNull String stacktrace, @NotNull Continuation $completion) { return ((ITNReporter)message.getSecond()).submitAutomated(new EJLoggingEvent(stacktrace), (IdeaPluginDescriptor)message.getThird(), $completion); } @NotNull private static final Logger LOG = Logger.getInstance(EJMessagePoolAutoReporter.class);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\b\020\006\032\0020\003H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/reporting/EJMessagePoolAutoReporter$EJLoggingEvent;", "Lcom/intellij/openapi/diagnostic/IdeaLoggingEvent;", "stacktrace", "", "<init>", "(Ljava/lang/String;)V", "getThrowableText", "ej-ui"})
/*    */   @StabilityInferred(parameters = 1)
/*    */   public static final class EJLoggingEvent extends IdeaLoggingEvent {
/*    */     @NotNull
/*    */     private final String stacktrace;
/*    */     public static final int $stable;
/*    */     
/*    */     public EJLoggingEvent(@NotNull String stacktrace) {
/*    */       super("Automatically reported exception", null, null);
/*    */       this.stacktrace = stacktrace;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String getThrowableText() {
/*    */       return this.stacktrace;
/*    */     }
/*    */   }
/*    */   
/*    */   protected boolean checkSubmitter(@Nullable ErrorReportSubmitter submitter) {
/*    */     return submitter instanceof AbstractEJMessagePoolAutoReporter.MyITNReporter;
/*    */   }
/*    */   
/*    */   public boolean newEntryConsumed(@NotNull AbstractMessage message) {
/*    */     Intrinsics.checkNotNullParameter(message, "message");
/*    */     Intrinsics.checkNotNullExpressionValue(message.getThrowable(), "getThrowable(...)");
/*    */     if (shouldShowErrorInRelease(message.getThrowable()))
/*    */       return false; 
/*    */     PluginId pluginId = PluginUtil.getInstance().findPluginId(message.getThrowable());
/*    */     Intrinsics.checkNotNullExpressionValue(message.getThrowable(), "getThrowable(...)");
/*    */     ErrorReportSubmitter submitter = IdeErrorsDialog.Companion.getSubmitter(message.getThrowable(), pluginId);
/*    */     if (submitter instanceof ITNReporter && checkSubmitter(submitter)) {
/*    */       IdeaPluginDescriptor plugin = PluginManagerCore.getPlugin(pluginId);
/*    */       if (plugin != null && Intrinsics.areEqual(plugin.getPluginId().getIdString(), "org.jetbrains.junie") && PluginInfoDetectorKt.getPluginInfoByDescriptor((PluginDescriptor)plugin).isSafeToReport()) {
/*    */         getMessages().tryEmit(new Triple(message, submitter, plugin));
/*    */         return !BuildConfigKt.getConfig().getEapExceptionProcessing();
/*    */       } 
/*    */     } 
/*    */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\reporting\EJMessagePoolAutoReporter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */