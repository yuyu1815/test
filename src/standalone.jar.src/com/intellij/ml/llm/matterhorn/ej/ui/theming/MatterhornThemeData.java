/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.theming;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.ColorKt;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import java.util.ArrayList;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.ui.icon.PathIconKey;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\bG\n\002\030\002\n\002\b\016\n\002\030\002\n\002\b;\n\002\020 \n\002\b\004\n\002\020\016\n\000\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\025\020X\032\0020\f2\006\020Y\032\0020\003¢\006\004\bZ\020[J\025\020\\\032\0020\f2\006\020Y\032\0020\003¢\006\004\b]\020[J\025\020^\032\0020\f2\006\020Y\032\0020\003¢\006\004\b_\020[J\025\020`\032\0020\f2\006\020Y\032\0020\003¢\006\004\ba\020[J\035\020¢\001\032\0020c2\b\020£\001\032\0030¤\0012\b\b\002\020\002\032\0020\003H\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\002\020\006R\021\020\007\032\0020\b8G¢\006\006\032\004\b\t\020\nR\023\020\013\032\0020\f¢\006\n\n\002\020\017\032\004\b\r\020\016R\023\020\020\032\0020\f¢\006\n\n\002\020\017\032\004\b\021\020\016R\023\020\022\032\0020\f¢\006\n\n\002\020\017\032\004\b\023\020\016R\023\020\024\032\0020\f¢\006\n\n\002\020\017\032\004\b\025\020\016R\021\020\026\032\0020\f8G¢\006\006\032\004\b\027\020\030R\023\020\031\032\0020\f¢\006\n\n\002\020\017\032\004\b\032\020\016R\023\020\033\032\0020\f¢\006\n\n\002\020\017\032\004\b\034\020\016R\023\020\035\032\0020\f¢\006\n\n\002\020\017\032\004\b\036\020\016R\023\020\037\032\0020\f¢\006\n\n\002\020\017\032\004\b \020\016R\023\020!\032\0020\f¢\006\n\n\002\020\017\032\004\b\"\020\016R\023\020#\032\0020\f¢\006\n\n\002\020\017\032\004\b$\020\016R\023\020%\032\0020\f¢\006\n\n\002\020\017\032\004\b&\020\016R\023\020'\032\0020\f¢\006\n\n\002\020\017\032\004\b(\020\016R\023\020)\032\0020\f¢\006\n\n\002\020\017\032\004\b*\020\016R\023\020+\032\0020\f¢\006\n\n\002\020\017\032\004\b,\020\016R\023\020-\032\0020\f¢\006\n\n\002\020\017\032\004\b.\020\016R\023\020/\032\0020\f¢\006\n\n\002\020\017\032\004\b0\020\016R\023\0201\032\0020\f¢\006\n\n\002\020\017\032\004\b2\020\016R\023\0203\032\0020\f¢\006\n\n\002\020\017\032\004\b4\020\016R\023\0205\032\0020\f¢\006\n\n\002\020\017\032\004\b6\020\016R\023\0207\032\0020\f¢\006\n\n\002\020\017\032\004\b8\020\016R\023\0209\032\0020\f¢\006\n\n\002\020\017\032\004\b:\020\016R\023\020;\032\0020\f¢\006\n\n\002\020\017\032\004\b<\020\016R\023\020=\032\0020\f¢\006\n\n\002\020\017\032\004\b>\020\016R\023\020?\032\0020\f¢\006\n\n\002\020\017\032\004\b@\020\016R\023\020A\032\0020\f¢\006\n\n\002\020\017\032\004\bB\020\016R\023\020C\032\0020\f¢\006\n\n\002\020\017\032\004\bD\020\016R\023\020E\032\0020\f¢\006\n\n\002\020\017\032\004\bF\020\016R\023\020G\032\0020\f¢\006\n\n\002\020\017\032\004\bH\020\016R\023\020I\032\0020\f¢\006\n\n\002\020\017\032\004\bJ\020\016R\023\020K\032\0020\f¢\006\n\n\002\020\017\032\004\bL\020\016R\023\020M\032\0020\f¢\006\n\n\002\020\017\032\004\bN\020\016R\023\020O\032\0020\f¢\006\n\n\002\020\017\032\004\bP\020\016R\023\020Q\032\0020\f¢\006\n\n\002\020\017\032\004\bR\020\016R\023\020S\032\0020T¢\006\n\n\002\020W\032\004\bU\020VR\021\020b\032\0020c¢\006\b\n\000\032\004\bd\020eR\021\020f\032\0020c¢\006\b\n\000\032\004\bg\020eR\021\020h\032\0020c¢\006\b\n\000\032\004\bi\020eR\021\020j\032\0020c¢\006\b\n\000\032\004\bk\020eR\021\020l\032\0020c¢\006\b\n\000\032\004\bm\020eR\021\020n\032\0020c¢\006\b\n\000\032\004\bo\020eR\021\020p\032\0020c¢\006\b\n\000\032\004\bq\020eR\021\020r\032\0020c¢\006\b\n\000\032\004\bs\020eR\021\020t\032\0020c¢\006\b\n\000\032\004\bu\020eR\021\020v\032\0020c¢\006\b\n\000\032\004\bw\020eR\021\020x\032\0020c¢\006\b\n\000\032\004\by\020eR\021\020z\032\0020c¢\006\b\n\000\032\004\b{\020eR\021\020|\032\0020c¢\006\b\n\000\032\004\b}\020eR\021\020~\032\0020c¢\006\b\n\000\032\004\b\020eR\023\020\001\032\0020c¢\006\t\n\000\032\005\b\001\020eR\023\020\001\032\0020c¢\006\t\n\000\032\005\b\001\020eR\023\020\001\032\0020c¢\006\t\n\000\032\005\b\001\020eR\023\020\001\032\0020c¢\006\t\n\000\032\005\b\001\020eR\023\020\001\032\0020c¢\006\t\n\000\032\005\b\001\020eR\023\020\001\032\0020c¢\006\t\n\000\032\005\b\001\020eR\023\020\001\032\0020c¢\006\t\n\000\032\005\b\001\020eR\023\020\001\032\0020c¢\006\t\n\000\032\005\b\001\020eR\023\020\001\032\0020c¢\006\t\n\000\032\005\b\001\020eR\023\020\001\032\0020c¢\006\t\n\000\032\005\b\001\020eR\023\020\001\032\0020c¢\006\t\n\000\032\005\b\001\020eR\023\020\001\032\0020c¢\006\t\n\000\032\005\b\001\020eR\023\020\001\032\0020c¢\006\t\n\000\032\005\b\001\020eR\023\020\001\032\0020c¢\006\t\n\000\032\005\b\001\020eR\023\020\001\032\0020c¢\006\t\n\000\032\005\b\001\020eR\033\020\001\032\t\022\004\022\0020c0\001¢\006\n\n\000\032\006\b \001\020¡\001¨\006¥\001"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;", "", "isDark", "", "<init>", "(Z)V", "()Z", "messageFont", "Landroidx/compose/ui/text/font/FontFamily;", "getMessageFont", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/FontFamily;", "separatorColor", "Landroidx/compose/ui/graphics/Color;", "getSeparatorColor-0d7_KjU", "()J", "J", "onboardingDotsColor", "getOnboardingDotsColor-0d7_KjU", "defaultBackgroundDotsColor", "getDefaultBackgroundDotsColor-0d7_KjU", "backgroundColor", "getBackgroundColor-0d7_KjU", "inactiveTextColor", "getInactiveTextColor", "(Landroidx/compose/runtime/Composer;I)J", "taskTitleTextColor", "getTaskTitleTextColor-0d7_KjU", "testFailColor", "getTestFailColor-0d7_KjU", "testSuccessColor", "getTestSuccessColor-0d7_KjU", "promptAreaBackgroundColor", "getPromptAreaBackgroundColor-0d7_KjU", "blockTextColor", "getBlockTextColor-0d7_KjU", "selectionBlockTextColor", "getSelectionBlockTextColor-0d7_KjU", "arrowRightIconTint", "getArrowRightIconTint-0d7_KjU", "arrowRightInactiveIconTint", "getArrowRightInactiveIconTint-0d7_KjU", "listSelectionColor", "getListSelectionColor-0d7_KjU", "listHoverColor", "getListHoverColor-0d7_KjU", "listSelectionHoverBorder", "getListSelectionHoverBorder-0d7_KjU", "errorInfoBorder", "getErrorInfoBorder-0d7_KjU", "errorInfoTextColor", "getErrorInfoTextColor-0d7_KjU", "fileComponentBackground", "getFileComponentBackground-0d7_KjU", "buttonTextColor", "getButtonTextColor-0d7_KjU", "primaryButtonBackgroundColor", "getPrimaryButtonBackgroundColor-0d7_KjU", "primaryButtonHoveredColor", "getPrimaryButtonHoveredColor-0d7_KjU", "primaryButtonPressedColor", "getPrimaryButtonPressedColor-0d7_KjU", "secondButtonBackgroundColor", "getSecondButtonBackgroundColor-0d7_KjU", "secondButtonHoveredColor", "getSecondButtonHoveredColor-0d7_KjU", "secondButtonPressedColor", "getSecondButtonPressedColor-0d7_KjU", "addedLinesColor", "getAddedLinesColor-0d7_KjU", "removedLinesColor", "getRemovedLinesColor-0d7_KjU", "pillColor", "getPillColor-0d7_KjU", "chipBackground", "getChipBackground-0d7_KjU", "chipBackgroundHovered", "getChipBackgroundHovered-0d7_KjU", "reportFileChipBackground", "getReportFileChipBackground-0d7_KjU", "reportFileChipBackgroundHovered", "getReportFileChipBackgroundHovered-0d7_KjU", "arrowDownIconBackgroundColor", "getArrowDownIconBackgroundColor-0d7_KjU", "titleMinHeight", "Landroidx/compose/ui/unit/Dp;", "getTitleMinHeight-D9Ej5fM", "()F", "F", "getButtonTextColor", "primary", "getButtonTextColor-vNxB06k", "(Z)J", "getButtonBackgroundColor", "getButtonBackgroundColor-vNxB06k", "getButtonHoveredColor", "getButtonHoveredColor-vNxB06k", "getButtonPressedColor", "getButtonPressedColor-vNxB06k", "welcomeLogoPath", "Lorg/jetbrains/jewel/ui/icon/PathIconKey;", "getWelcomeLogoPath", "()Lorg/jetbrains/jewel/ui/icon/PathIconKey;", "attachedIcon", "getAttachedIcon", "braveModeInfoIcon", "getBraveModeInfoIcon", "doneButtonIcon", "getDoneButtonIcon", "refreshIcon", "getRefreshIcon", "resultIncorrect", "getResultIncorrect", "pauseStateIcon", "getPauseStateIcon", "stoppedStateIcon", "getStoppedStateIcon", "errorStateIcon", "getErrorStateIcon", "resetTaskIcon", "getResetTaskIcon", "editorOnlyIcon", "getEditorOnlyIcon", "editIcon", "getEditIcon", "showIcon", "getShowIcon", "infoIcon", "getInfoIcon", "terminalIcon", "getTerminalIcon", "doneStateIcon", "getDoneStateIcon", "chatResponsesIcon", "getChatResponsesIcon", "doneStatusIcon", "getDoneStatusIcon", "errorOutlineIcon", "getErrorOutlineIcon", "pauseStatusIcon", "getPauseStatusIcon", "stoppedStatusIcon", "getStoppedStatusIcon", "arrowDownIcon", "getArrowDownIcon", "bulletIcon", "getBulletIcon", "moreVerticalIcon", "getMoreVerticalIcon", "addToVcs", "getAddToVcs", "removeFromVcs", "getRemoveFromVcs", "promo1", "getPromo1", "promo2", "getPromo2", "promo3", "getPromo3", "spinnerIcons", "", "getSpinnerIcons", "()Ljava/util/List;", "iconPath", "path", "", "standalone"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nMatterhornThemeData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornThemeData.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,185:1\n149#2:186\n*S KotlinDebug\n*F\n+ 1 MatterhornThemeData.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData\n*L\n85#1:186\n*E\n"})
/*     */ public final class MatterhornThemeData {
/*     */   public MatterhornThemeData(boolean isDark) {
/*  16 */     this.isDark = isDark;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  21 */     this.separatorColor = this.isDark ? ColorKt.Color(4281940800L) : ColorKt.Color(4293651696L);
/*  22 */     this.onboardingDotsColor = ColorKt.Color(4282966100L);
/*  23 */     this.defaultBackgroundDotsColor = this.isDark ? ColorKt.Color(4281019696L) : ColorKt.Color(4292862437L);
/*  24 */     this.backgroundColor = this.isDark ? ColorKt.Color(4280164130L) : Color.Companion.getWhite-0d7_KjU();
/*     */ 
/*     */ 
/*     */     
/*  28 */     this.taskTitleTextColor = this.isDark ? ColorKt.Color(4292862437L) : Color.Companion.getBlack-0d7_KjU();
/*     */     
/*  30 */     this.testFailColor = ColorKt.Color(4292566108L);
/*  31 */     this.testSuccessColor = ColorKt.Color(4284460389L);
/*     */ 
/*     */     
/*  34 */     this.promptAreaBackgroundColor = this.isDark ? ColorKt.Color(4281019696L) : ColorKt.Color(4293651696L);
/*  35 */     this.blockTextColor = this.isDark ? ColorKt.Color(4287007377L) : ColorKt.Color(4284112235L);
/*     */     
/*  37 */     this.selectionBlockTextColor = this.isDark ? ColorKt.Color(4286819580L) : ColorKt.Color(4281226659L);
/*     */     
/*  39 */     this.arrowRightIconTint = this.isDark ? Color.Companion.getUnspecified-0d7_KjU() : Color.Companion.getWhite-0d7_KjU();
/*     */     
/*  41 */     this.arrowRightInactiveIconTint = this.isDark ? ColorKt.Color(4282598730L) : ColorKt.Color(4292862437L);
/*     */     
/*  43 */     this.listSelectionColor = this.isDark ? ColorKt.Color(4280627789L) : ColorKt.Color(4292141823L);
/*     */     
/*  45 */     this.listHoverColor = this.isDark ? ColorKt.Color(4281940800L) : ColorKt.Color(4293651696L);
/*     */     
/*  47 */     this.listSelectionHoverBorder = this.isDark ? ColorKt.Color(4281819053L) : ColorKt.Color(4288724472L);
/*     */     
/*  49 */     this.errorInfoBorder = this.isDark ? ColorKt.Color(4284364856L) : ColorKt.Color(4291573317L);
/*     */     
/*  51 */     this.errorInfoTextColor = this.isDark ? ColorKt.Color(4294095274L) : ColorKt.Color(4292557643L);
/*     */     
/*  53 */     this.fileComponentBackground = this.isDark ? ColorKt.Color(4283322711L) : ColorKt.Color(4292072923L);
/*     */     
/*  55 */     this.buttonTextColor = this.isDark ? ColorKt.Color(4288265215L) : ColorKt.Color(4281693680L);
/*     */     
/*  57 */     this.primaryButtonBackgroundColor = ColorKt.Color(4281693424L);
/*     */     
/*  59 */     this.primaryButtonHoveredColor = ColorKt.Color(4281756367L);
/*     */     
/*  61 */     this.primaryButtonPressedColor = ColorKt.Color(4281819053L);
/*     */     
/*  63 */     this.secondButtonBackgroundColor = this.isDark ? ColorKt.Color(4280627789L) : ColorKt.Color(4292141823L);
/*     */     
/*  65 */     this.secondButtonHoveredColor = this.isDark ? ColorKt.Color(4291944703L) : ColorKt.Color(4290959100L);
/*     */     
/*  67 */     this.secondButtonPressedColor = this.isDark ? ColorKt.Color(4290105087L) : ColorKt.Color(4281226659L);
/*     */     
/*  69 */     this.addedLinesColor = ColorKt.Color(4285180787L);
/*  70 */     this.removedLinesColor = ColorKt.Color(4294399076L);
/*     */     
/*  72 */     this.pillColor = this.isDark ? ColorKt.Color(4281019696L) : ColorKt.Color(4294441210L);
/*     */ 
/*     */     
/*  75 */     this.chipBackground = this.isDark ? ColorKt.Color(4281019696L) : ColorKt.Color(4294441210L);
/*  76 */     this.chipBackgroundHovered = this.isDark ? ColorKt.Color(4281940800L) : ColorKt.Color(4293651696L);
/*     */ 
/*     */     
/*  79 */     this.reportFileChipBackground = this.isDark ? Color.Companion.getUnspecified-0d7_KjU() : Color.Companion.getUnspecified-0d7_KjU();
/*  80 */     this.reportFileChipBackgroundHovered = this.isDark ? ColorKt.Color(4280164130L) : Color.Companion.getWhite-0d7_KjU();
/*     */     
/*  82 */     this.arrowDownIconBackgroundColor = ColorKt.Color(4280627789L);
/*     */ 
/*     */     
/*  85 */     int $this$dp$iv = 30, $i$f$getDp = 0; this.titleMinHeight = 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 186 */       Dp.constructor-impl($this$dp$iv);
/*     */     this.welcomeLogoPath = iconPath$default(this, "welcomeLogo", false, 2, null);
/*     */     this.attachedIcon = iconPath$default(this, "attached", false, 2, null);
/*     */     this.braveModeInfoIcon = iconPath$default(this, "braveModeInfo", false, 2, null);
/*     */     this.doneButtonIcon = iconPath$default(this, "doneButton", false, 2, null);
/*     */     this.refreshIcon = iconPath$default(this, "refresh", false, 2, null);
/*     */     this.resultIncorrect = iconPath$default(this, "resultIncorrect", false, 2, null);
/*     */     this.pauseStateIcon = iconPath$default(this, "pauseState", false, 2, null);
/*     */     this.stoppedStateIcon = iconPath$default(this, "stoppedState", false, 2, null);
/*     */     this.errorStateIcon = iconPath$default(this, "errorState", false, 2, null);
/*     */     this.resetTaskIcon = iconPath$default(this, "resetTask", false, 2, null);
/*     */     this.editorOnlyIcon = iconPath$default(this, "editorOnly", false, 2, null);
/*     */     this.editIcon = iconPath$default(this, "edit", false, 2, null);
/*     */     this.showIcon = iconPath$default(this, "show", false, 2, null);
/*     */     this.infoIcon = iconPath$default(this, "info", false, 2, null);
/*     */     this.terminalIcon = iconPath$default(this, "terminal", false, 2, null);
/*     */     this.doneStateIcon = iconPath$default(this, "doneState", false, 2, null);
/*     */     this.chatResponsesIcon = iconPath$default(this, "perplexity", false, 2, null);
/*     */     this.doneStatusIcon = iconPath$default(this, "doneStatus", false, 2, null);
/*     */     this.errorOutlineIcon = iconPath$default(this, "errorOutline", false, 2, null);
/*     */     this.pauseStatusIcon = iconPath$default(this, "pauseStatus", false, 2, null);
/*     */     this.stoppedStatusIcon = iconPath$default(this, "stoppedStatus", false, 2, null);
/*     */     this.arrowDownIcon = iconPath$default(this, "down", false, 2, null);
/*     */     this.bulletIcon = iconPath$default(this, "bullet", false, 2, null);
/*     */     this.moreVerticalIcon = iconPath$default(this, "moreVertical", false, 2, null);
/*     */     this.addToVcs = iconPath$default(this, "addToGit", false, 2, null);
/*     */     this.removeFromVcs = iconPath$default(this, "removeFromGit", false, 2, null);
/*     */     this.promo1 = iconPath$default(this, "icon-login-promo-1", false, 2, null);
/*     */     this.promo2 = iconPath$default(this, "icon-login-promo-2", false, 2, null);
/*     */     this.promo3 = iconPath$default(this, "icon-login-promo-3", false, 2, null);
/*     */     ArrayList<PathIconKey> arrayList;
/*     */     byte b;
/*     */     MatterhornThemeData matterhornThemeData;
/*     */     for ($this$dp$iv = 24, matterhornThemeData = this, arrayList = new ArrayList($this$dp$iv), b = 0; b < $this$dp$iv; ) {
/*     */       byte b1 = b, b2 = b1;
/*     */       ArrayList<PathIconKey> arrayList1 = arrayList;
/*     */       int $i$a$-List-MatterhornThemeData$spinnerIcons$1 = 0;
/*     */       String spinnerIndex = StringsKt.padStart(String.valueOf(b2 + 1), 2, '0');
/*     */       arrayList1.add(new PathIconKey("/icons/spinner/" + spinnerIndex + ".svg", MatterhornThemeData.class));
/*     */       b++;
/*     */     } 
/*     */     matterhornThemeData.spinnerIcons = arrayList;
/*     */   }
/*     */   
/*     */   private final boolean isDark;
/*     */   private final long separatorColor;
/*     */   private final long onboardingDotsColor;
/*     */   private final long defaultBackgroundDotsColor;
/*     */   private final long backgroundColor;
/*     */   private final long taskTitleTextColor;
/*     */   private final long testFailColor;
/*     */   private final long testSuccessColor;
/*     */   private final long promptAreaBackgroundColor;
/*     */   private final long blockTextColor;
/*     */   private final long selectionBlockTextColor;
/*     */   private final long arrowRightIconTint;
/*     */   private final long arrowRightInactiveIconTint;
/*     */   private final long listSelectionColor;
/*     */   private final long listHoverColor;
/*     */   private final long listSelectionHoverBorder;
/*     */   private final long errorInfoBorder;
/*     */   private final long errorInfoTextColor;
/*     */   private final long fileComponentBackground;
/*     */   private final long buttonTextColor;
/*     */   private final long primaryButtonBackgroundColor;
/*     */   private final long primaryButtonHoveredColor;
/*     */   private final long primaryButtonPressedColor;
/*     */   private final long secondButtonBackgroundColor;
/*     */   private final long secondButtonHoveredColor;
/*     */   private final long secondButtonPressedColor;
/*     */   private final long addedLinesColor;
/*     */   private final long removedLinesColor;
/*     */   private final long pillColor;
/*     */   private final long chipBackground;
/*     */   private final long chipBackgroundHovered;
/*     */   private final long reportFileChipBackground;
/*     */   private final long reportFileChipBackgroundHovered;
/*     */   private final long arrowDownIconBackgroundColor;
/*     */   private final float titleMinHeight;
/*     */   @NotNull
/*     */   private final PathIconKey welcomeLogoPath;
/*     */   @NotNull
/*     */   private final PathIconKey attachedIcon;
/*     */   @NotNull
/*     */   private final PathIconKey braveModeInfoIcon;
/*     */   @NotNull
/*     */   private final PathIconKey doneButtonIcon;
/*     */   @NotNull
/*     */   private final PathIconKey refreshIcon;
/*     */   @NotNull
/*     */   private final PathIconKey resultIncorrect;
/*     */   @NotNull
/*     */   private final PathIconKey pauseStateIcon;
/*     */   @NotNull
/*     */   private final PathIconKey stoppedStateIcon;
/*     */   @NotNull
/*     */   private final PathIconKey errorStateIcon;
/*     */   @NotNull
/*     */   private final PathIconKey resetTaskIcon;
/*     */   @NotNull
/*     */   private final PathIconKey editorOnlyIcon;
/*     */   @NotNull
/*     */   private final PathIconKey editIcon;
/*     */   @NotNull
/*     */   private final PathIconKey showIcon;
/*     */   @NotNull
/*     */   private final PathIconKey infoIcon;
/*     */   @NotNull
/*     */   private final PathIconKey terminalIcon;
/*     */   @NotNull
/*     */   private final PathIconKey doneStateIcon;
/*     */   @NotNull
/*     */   private final PathIconKey chatResponsesIcon;
/*     */   @NotNull
/*     */   private final PathIconKey doneStatusIcon;
/*     */   @NotNull
/*     */   private final PathIconKey errorOutlineIcon;
/*     */   @NotNull
/*     */   private final PathIconKey pauseStatusIcon;
/*     */   @NotNull
/*     */   private final PathIconKey stoppedStatusIcon;
/*     */   @NotNull
/*     */   private final PathIconKey arrowDownIcon;
/*     */   @NotNull
/*     */   private final PathIconKey bulletIcon;
/*     */   @NotNull
/*     */   private final PathIconKey moreVerticalIcon;
/*     */   @NotNull
/*     */   private final PathIconKey addToVcs;
/*     */   @NotNull
/*     */   private final PathIconKey removeFromVcs;
/*     */   @NotNull
/*     */   private final PathIconKey promo1;
/*     */   @NotNull
/*     */   private final PathIconKey promo2;
/*     */   @NotNull
/*     */   private final PathIconKey promo3;
/*     */   @NotNull
/*     */   private final List<PathIconKey> spinnerIcons;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public final boolean isDark() {
/*     */     return this.isDark;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @JvmName(name = "getMessageFont")
/*     */   @NotNull
/*     */   public final FontFamily getMessageFont(@Nullable Composer $composer, int $changed) {
/*     */     $composer.startReplaceGroup(-2038544273);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(-2038544273, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeData.<get-messageFont> (MatterhornThemeData.kt:17)"); 
/*     */     Font[] arrayOfFont = new Font[1];
/*     */     arrayOfFont[0] = FontResources_skikoKt.Font-DnXFreY(Font0_mainKt.getJetBrainsMonoQuattroVF(Res.font.INSTANCE), null, 0, $composer, 0, 6);
/*     */     FontFamily fontFamily = FontFamilyKt.FontFamily(arrayOfFont);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return fontFamily;
/*     */   }
/*     */   
/*     */   public final long getSeparatorColor-0d7_KjU() {
/*     */     return this.separatorColor;
/*     */   }
/*     */   
/*     */   public final long getOnboardingDotsColor-0d7_KjU() {
/*     */     return this.onboardingDotsColor;
/*     */   }
/*     */   
/*     */   public final long getDefaultBackgroundDotsColor-0d7_KjU() {
/*     */     return this.defaultBackgroundDotsColor;
/*     */   }
/*     */   
/*     */   public final long getBackgroundColor-0d7_KjU() {
/*     */     return this.backgroundColor;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @JvmName(name = "getInactiveTextColor")
/*     */   public final long getInactiveTextColor(@Nullable Composer $composer, int $changed) {
/*     */     $composer.startReplaceGroup(221619181);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(221619181, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeData.<get-inactiveTextColor> (MatterhornThemeData.kt:26)"); 
/*     */     long l = JewelThemeKt.getTextAreaStyle(JewelTheme.Companion, $composer, 6).getColors().getContentDisabled-0d7_KjU();
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return l;
/*     */   }
/*     */   
/*     */   public final long getTaskTitleTextColor-0d7_KjU() {
/*     */     return this.taskTitleTextColor;
/*     */   }
/*     */   
/*     */   public final long getTestFailColor-0d7_KjU() {
/*     */     return this.testFailColor;
/*     */   }
/*     */   
/*     */   public final long getTestSuccessColor-0d7_KjU() {
/*     */     return this.testSuccessColor;
/*     */   }
/*     */   
/*     */   public final long getPromptAreaBackgroundColor-0d7_KjU() {
/*     */     return this.promptAreaBackgroundColor;
/*     */   }
/*     */   
/*     */   public final long getBlockTextColor-0d7_KjU() {
/*     */     return this.blockTextColor;
/*     */   }
/*     */   
/*     */   public final long getSelectionBlockTextColor-0d7_KjU() {
/*     */     return this.selectionBlockTextColor;
/*     */   }
/*     */   
/*     */   public final long getArrowRightIconTint-0d7_KjU() {
/*     */     return this.arrowRightIconTint;
/*     */   }
/*     */   
/*     */   public final long getArrowRightInactiveIconTint-0d7_KjU() {
/*     */     return this.arrowRightInactiveIconTint;
/*     */   }
/*     */   
/*     */   public final long getListSelectionColor-0d7_KjU() {
/*     */     return this.listSelectionColor;
/*     */   }
/*     */   
/*     */   public final long getListHoverColor-0d7_KjU() {
/*     */     return this.listHoverColor;
/*     */   }
/*     */   
/*     */   public final long getListSelectionHoverBorder-0d7_KjU() {
/*     */     return this.listSelectionHoverBorder;
/*     */   }
/*     */   
/*     */   public final long getErrorInfoBorder-0d7_KjU() {
/*     */     return this.errorInfoBorder;
/*     */   }
/*     */   
/*     */   public final long getErrorInfoTextColor-0d7_KjU() {
/*     */     return this.errorInfoTextColor;
/*     */   }
/*     */   
/*     */   public final long getFileComponentBackground-0d7_KjU() {
/*     */     return this.fileComponentBackground;
/*     */   }
/*     */   
/*     */   public final long getButtonTextColor-0d7_KjU() {
/*     */     return this.buttonTextColor;
/*     */   }
/*     */   
/*     */   public final long getPrimaryButtonBackgroundColor-0d7_KjU() {
/*     */     return this.primaryButtonBackgroundColor;
/*     */   }
/*     */   
/*     */   public final long getPrimaryButtonHoveredColor-0d7_KjU() {
/*     */     return this.primaryButtonHoveredColor;
/*     */   }
/*     */   
/*     */   public final long getPrimaryButtonPressedColor-0d7_KjU() {
/*     */     return this.primaryButtonPressedColor;
/*     */   }
/*     */   
/*     */   public final long getSecondButtonBackgroundColor-0d7_KjU() {
/*     */     return this.secondButtonBackgroundColor;
/*     */   }
/*     */   
/*     */   public final long getSecondButtonHoveredColor-0d7_KjU() {
/*     */     return this.secondButtonHoveredColor;
/*     */   }
/*     */   
/*     */   public final long getSecondButtonPressedColor-0d7_KjU() {
/*     */     return this.secondButtonPressedColor;
/*     */   }
/*     */   
/*     */   public final long getAddedLinesColor-0d7_KjU() {
/*     */     return this.addedLinesColor;
/*     */   }
/*     */   
/*     */   public final long getRemovedLinesColor-0d7_KjU() {
/*     */     return this.removedLinesColor;
/*     */   }
/*     */   
/*     */   public final long getPillColor-0d7_KjU() {
/*     */     return this.pillColor;
/*     */   }
/*     */   
/*     */   public final long getChipBackground-0d7_KjU() {
/*     */     return this.chipBackground;
/*     */   }
/*     */   
/*     */   public final long getChipBackgroundHovered-0d7_KjU() {
/*     */     return this.chipBackgroundHovered;
/*     */   }
/*     */   
/*     */   public final long getReportFileChipBackground-0d7_KjU() {
/*     */     return this.reportFileChipBackground;
/*     */   }
/*     */   
/*     */   public final long getReportFileChipBackgroundHovered-0d7_KjU() {
/*     */     return this.reportFileChipBackgroundHovered;
/*     */   }
/*     */   
/*     */   public final long getArrowDownIconBackgroundColor-0d7_KjU() {
/*     */     return this.arrowDownIconBackgroundColor;
/*     */   }
/*     */   
/*     */   public final float getTitleMinHeight-D9Ej5fM() {
/*     */     return this.titleMinHeight;
/*     */   }
/*     */   
/*     */   public final long getButtonTextColor-vNxB06k(boolean primary) {
/*     */     if (primary)
/*     */       return Color.Companion.getWhite-0d7_KjU(); 
/*     */     return this.buttonTextColor;
/*     */   }
/*     */   
/*     */   public final long getButtonBackgroundColor-vNxB06k(boolean primary) {
/*     */     if (primary)
/*     */       return this.primaryButtonBackgroundColor; 
/*     */     return this.secondButtonBackgroundColor;
/*     */   }
/*     */   
/*     */   public final long getButtonHoveredColor-vNxB06k(boolean primary) {
/*     */     if (primary)
/*     */       return this.primaryButtonHoveredColor; 
/*     */     return this.secondButtonHoveredColor;
/*     */   }
/*     */   
/*     */   public final long getButtonPressedColor-vNxB06k(boolean primary) {
/*     */     if (primary)
/*     */       return this.primaryButtonPressedColor; 
/*     */     return this.secondButtonPressedColor;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getWelcomeLogoPath() {
/*     */     return this.welcomeLogoPath;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getAttachedIcon() {
/*     */     return this.attachedIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getBraveModeInfoIcon() {
/*     */     return this.braveModeInfoIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getDoneButtonIcon() {
/*     */     return this.doneButtonIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getRefreshIcon() {
/*     */     return this.refreshIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getResultIncorrect() {
/*     */     return this.resultIncorrect;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getPauseStateIcon() {
/*     */     return this.pauseStateIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getStoppedStateIcon() {
/*     */     return this.stoppedStateIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getErrorStateIcon() {
/*     */     return this.errorStateIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getResetTaskIcon() {
/*     */     return this.resetTaskIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getEditorOnlyIcon() {
/*     */     return this.editorOnlyIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getEditIcon() {
/*     */     return this.editIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getShowIcon() {
/*     */     return this.showIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getInfoIcon() {
/*     */     return this.infoIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getTerminalIcon() {
/*     */     return this.terminalIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getDoneStateIcon() {
/*     */     return this.doneStateIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getChatResponsesIcon() {
/*     */     return this.chatResponsesIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getDoneStatusIcon() {
/*     */     return this.doneStatusIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getErrorOutlineIcon() {
/*     */     return this.errorOutlineIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getPauseStatusIcon() {
/*     */     return this.pauseStatusIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getStoppedStatusIcon() {
/*     */     return this.stoppedStatusIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getArrowDownIcon() {
/*     */     return this.arrowDownIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getBulletIcon() {
/*     */     return this.bulletIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getMoreVerticalIcon() {
/*     */     return this.moreVerticalIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getAddToVcs() {
/*     */     return this.addToVcs;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getRemoveFromVcs() {
/*     */     return this.removeFromVcs;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getPromo1() {
/*     */     return this.promo1;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getPromo2() {
/*     */     return this.promo2;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathIconKey getPromo3() {
/*     */     return this.promo3;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<PathIconKey> getSpinnerIcons() {
/*     */     return this.spinnerIcons;
/*     */   }
/*     */   
/*     */   private final PathIconKey iconPath(String path, boolean isDark) {
/*     */     return new PathIconKey(isDark ? ("/icons/" + path + "_dark.svg") : ("/icons/" + path + ".svg"), MatterhornThemeData.class);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\theming\MatterhornThemeData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */