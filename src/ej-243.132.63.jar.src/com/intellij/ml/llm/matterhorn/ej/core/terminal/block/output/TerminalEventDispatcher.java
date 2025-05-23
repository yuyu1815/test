/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.ide.IdeEventQueue;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.actionSystem.ActionManager;
/*     */ import com.intellij.openapi.actionSystem.AnAction;
/*     */ import com.intellij.openapi.actionSystem.KeyboardShortcut;
/*     */ import com.intellij.openapi.actionSystem.Shortcut;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.observable.util.RevertOnDisposeUtilKt;
/*     */ import com.intellij.openapi.util.registry.Registry;
/*     */ import com.intellij.util.concurrency.ThreadingAssertions;
/*     */ import java.awt.AWTEvent;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.KeyListener;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import javax.swing.KeyStroke;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NonNls;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\002\030\002\n\002\b\007\b \030\000 \0332\0020\001:\002\032\033B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\020\020\020\032\0020\0132\006\020\021\032\0020\022H\026J\020\020\023\032\0020\0242\006\020\021\032\0020\025H\002J\020\020\026\032\0020\0242\006\020\021\032\0020\025H$J\024\020\027\032\0020\0242\f\020\f\032\b\022\004\022\0020\0160\rJ\006\020\030\032\0020\024J\020\020\031\032\0020\0132\006\020\021\032\0020\025H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\n\032\0020\013X\016¢\006\002\n\000R\024\020\f\032\b\022\004\022\0020\0160\rX\016¢\006\002\n\000R\016\020\017\032\0020\013X\016¢\006\002\n\000¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventDispatcher;", "Lcom/intellij/ide/IdeEventQueue$EventDispatcher;", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "<init>", "(Lcom/intellij/openapi/editor/ex/EditorEx;Lcom/intellij/openapi/Disposable;)V", "keyListener", "Ljava/awt/event/KeyListener;", "myRegistered", "", "actionsToSkip", "", "Lcom/intellij/openapi/actionSystem/AnAction;", "ignoreNextKeyTypedEvent", "dispatch", "e", "Ljava/awt/AWTEvent;", "dispatchKeyEvent", "", "Ljava/awt/event/KeyEvent;", "handleKeyEvent", "register", "unregister", "skipAction", "MyKeyEventsListener", "Companion", "ej-core"})
/*     */ public abstract class TerminalEventDispatcher
/*     */   implements IdeEventQueue.EventDispatcher
/*     */ {
/*     */   public TerminalEventDispatcher(@NotNull EditorEx editor, @NotNull Disposable parentDisposable) {
/*  41 */     this.editor = editor;
/*  42 */     this.parentDisposable = parentDisposable;
/*     */     
/*  44 */     this.keyListener = new MyKeyEventsListener();
/*     */     
/*  46 */     this.actionsToSkip = CollectionsKt.emptyList();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean dispatch(@NotNull AWTEvent e) {
/*  51 */     Intrinsics.checkNotNullParameter(e, "e"); if (e instanceof KeyEvent) {
/*  52 */       dispatchKeyEvent((KeyEvent)e);
/*     */     }
/*  54 */     return false;
/*     */   }
/*     */   
/*     */   private final void dispatchKeyEvent(KeyEvent e) {
/*  58 */     if (!skipAction(e)) {
/*  59 */       if (e.getID() != 400 || !this.ignoreNextKeyTypedEvent) {
/*  60 */         this.ignoreNextKeyTypedEvent = false;
/*  61 */         handleKeyEvent(e);
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/*  66 */       this.ignoreNextKeyTypedEvent = true;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final void register(@NotNull List<? extends AnAction> actionsToSkip) {
/*  73 */     Intrinsics.checkNotNullParameter(actionsToSkip, "actionsToSkip"); ThreadingAssertions.assertEventDispatchThread();
/*  74 */     this.actionsToSkip = actionsToSkip;
/*  75 */     if (!this.myRegistered) {
/*  76 */       IdeEventQueue.Companion.getInstance().addDispatcher(this, this.parentDisposable);
/*  77 */       Intrinsics.checkNotNullExpressionValue(this.editor.getContentComponent(), "getContentComponent(...)"); RevertOnDisposeUtilKt.addKeyListener(this.editor.getContentComponent(), this.parentDisposable, this.keyListener);
/*  78 */       this.myRegistered = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void unregister() {
/*  83 */     ThreadingAssertions.assertEventDispatchThread();
/*  84 */     if (this.myRegistered) {
/*  85 */       IdeEventQueue.Companion.getInstance().removeDispatcher(this);
/*  86 */       this.editor.getContentComponent().removeKeyListener(this.keyListener);
/*  87 */       this.actionsToSkip = CollectionsKt.emptyList();
/*  88 */       this.myRegistered = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private final boolean skipAction(KeyEvent e) {
/*  93 */     KeyboardShortcut eventShortcut = new KeyboardShortcut(KeyStroke.getKeyStrokeForEvent(e), null);
/*  94 */     for (AnAction action : this.actionsToSkip) {
/*  95 */       Shortcut[] arrayOfShortcut; byte b; int i; for (arrayOfShortcut = action.getShortcutSet().getShortcuts(), b = 0, i = arrayOfShortcut.length; b < i; ) { Shortcut sc = arrayOfShortcut[b];
/*  96 */         if (sc.isKeyboard() && sc.startsWith((Shortcut)eventShortcut)) {
/*  97 */           if (!Registry.Companion.is("terminal.Ctrl-E.opens.RecentFiles.popup", 
/*  98 */               false) && Intrinsics.areEqual("RecentFiles", ActionManager.getInstance().getId(action))) {
/*  99 */             return (e.getModifiersEx() == 128 && e.getKeyCode() == 69);
/*     */           }
/* 101 */           return true;
/*     */         }  b++; }
/*     */     
/*     */     } 
/* 105 */     return false;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b\004\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\020\020\b\032\0020\0052\006\020\006\032\0020\007H\026¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventDispatcher$MyKeyEventsListener;", "Ljava/awt/event/KeyAdapter;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventDispatcher;)V", "keyTyped", "", "e", "Ljava/awt/event/KeyEvent;", "keyPressed", "ej-core"})
/*     */   private final class MyKeyEventsListener extends KeyAdapter { public void keyTyped(@NotNull KeyEvent e) {
/* 110 */       Intrinsics.checkNotNullParameter(e, "e"); TerminalEventDispatcher.this.handleKeyEvent(e);
/*     */     }
/*     */ 
/*     */     
/*     */     public void keyPressed(@NotNull KeyEvent e) {
/* 115 */       Intrinsics.checkNotNullParameter(e, "e"); TerminalEventDispatcher.this.ignoreNextKeyTypedEvent = false;
/* 116 */       TerminalEventDispatcher.this.handleKeyEvent(e);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\007\032\b\022\004\022\0020\b0\005R\026\020\004\032\b\022\004\022\0020\0060\0058\002X\004¢\006\002\n\000¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventDispatcher$Companion;", "", "<init>", "()V", "ACTIONS_TO_SKIP", "", "", "getActionsToSkip", "Lcom/intellij/openapi/actionSystem/AnAction;", "ej-core"})
/*     */   @SourceDebugExtension({"SMAP\nTerminalEventDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalEventDispatcher.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventDispatcher$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n1611#2,9:266\n1863#2:275\n1864#2:277\n1620#2:278\n1#3:276\n*S KotlinDebug\n*F\n+ 1 TerminalEventDispatcher.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventDispatcher$Companion\n*L\n181#1:266,9\n181#1:275\n181#1:277\n181#1:278\n181#1:276\n*E\n"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final List<AnAction> getActionsToSkip() {
/* 180 */       ActionManager actionManager = ActionManager.getInstance();
/* 181 */       Iterable $this$mapNotNull$iv = TerminalEventDispatcher.ACTIONS_TO_SKIP; int $i$f$mapNotNull = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 266 */       Iterable iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 274 */       Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 275 */       Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; String actionId = (String)element$iv$iv;
/*     */         int $i$a$-mapNotNull-TerminalEventDispatcher$Companion$getActionsToSkip$1 = 0; }
/*     */       
/* 278 */       return (List<AnAction>)destination$iv$iv;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final EditorEx editor;
/*     */   @NotNull
/*     */   private final Disposable parentDisposable;
/*     */   @NotNull
/*     */   private final KeyListener keyListener;
/*     */   private boolean myRegistered;
/*     */   @NotNull
/*     */   private List<? extends AnAction> actionsToSkip;
/*     */   private boolean ignoreNextKeyTypedEvent;
/*     */   @NonNls
/*     */   @NotNull
/*     */   private static final List<String> ACTIONS_TO_SKIP;
/*     */   
/*     */   static {
/*     */     String[] arrayOfString = new String[54];
/*     */     arrayOfString[0] = "ActivateTerminalToolWindow";
/*     */     arrayOfString[1] = "ActivateProjectToolWindow";
/*     */     arrayOfString[2] = "ActivateFavoritesToolWindow";
/*     */     arrayOfString[3] = "ActivateBookmarksToolWindow";
/*     */     arrayOfString[4] = "ActivateFindToolWindow";
/*     */     arrayOfString[5] = "ActivateRunToolWindow";
/*     */     arrayOfString[6] = "ActivateDebugToolWindow";
/*     */     arrayOfString[7] = "ActivateProblemsViewToolWindow";
/*     */     arrayOfString[8] = "ActivateTODOToolWindow";
/*     */     arrayOfString[9] = "ActivateStructureToolWindow";
/*     */     arrayOfString[10] = "ActivateHierarchyToolWindow";
/*     */     arrayOfString[11] = "ActivateServicesToolWindow";
/*     */     arrayOfString[12] = "ActivateCommitToolWindow";
/*     */     arrayOfString[13] = "ActivateVersionControlToolWindow";
/*     */     arrayOfString[14] = "EditorEscape";
/*     */     arrayOfString[15] = "HideActiveWindow";
/*     */     arrayOfString[16] = "HideAllWindows";
/*     */     arrayOfString[17] = "NextWindow";
/*     */     arrayOfString[18] = "PreviousWindow";
/*     */     arrayOfString[19] = "NextProjectWindow";
/*     */     arrayOfString[20] = "PreviousProjectWindow";
/*     */     arrayOfString[21] = "ShowBookmarks";
/*     */     arrayOfString[22] = "ShowTypeBookmarks";
/*     */     arrayOfString[23] = "FindInPath";
/*     */     arrayOfString[24] = "GotoBookmark0";
/*     */     arrayOfString[25] = "GotoBookmark1";
/*     */     arrayOfString[26] = "GotoBookmark2";
/*     */     arrayOfString[27] = "GotoBookmark3";
/*     */     arrayOfString[28] = "GotoBookmark4";
/*     */     arrayOfString[29] = "GotoBookmark5";
/*     */     arrayOfString[30] = "GotoBookmark6";
/*     */     arrayOfString[31] = "GotoBookmark7";
/*     */     arrayOfString[32] = "GotoBookmark8";
/*     */     arrayOfString[33] = "GotoBookmark9";
/*     */     arrayOfString[34] = "GotoAction";
/*     */     arrayOfString[35] = "GotoFile";
/*     */     arrayOfString[36] = "GotoClass";
/*     */     arrayOfString[37] = "GotoSymbol";
/*     */     arrayOfString[38] = "Vcs.Push";
/*     */     arrayOfString[39] = "ShowSettings";
/*     */     arrayOfString[40] = "RecentFiles";
/*     */     arrayOfString[41] = "Switcher";
/*     */     arrayOfString[42] = "ResizeToolWindowLeft";
/*     */     arrayOfString[43] = "ResizeToolWindowRight";
/*     */     arrayOfString[44] = "ResizeToolWindowUp";
/*     */     arrayOfString[45] = "ResizeToolWindowDown";
/*     */     arrayOfString[46] = "MaximizeToolWindow";
/*     */     arrayOfString[47] = "MaintenanceAction";
/*     */     arrayOfString[48] = "TerminalIncreaseFontSize";
/*     */     arrayOfString[49] = "TerminalDecreaseFontSize";
/*     */     arrayOfString[50] = "TerminalResetFontSize";
/*     */     arrayOfString[51] = "Terminal.Paste";
/*     */     arrayOfString[52] = "Terminal.CopySelectedText";
/*     */     arrayOfString[53] = "Terminal.CopyBlock";
/*     */     ACTIONS_TO_SKIP = CollectionsKt.listOf((Object[])arrayOfString);
/*     */   }
/*     */   
/*     */   protected abstract void handleKeyEvent(@NotNull KeyEvent paramKeyEvent);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalEventDispatcher.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */