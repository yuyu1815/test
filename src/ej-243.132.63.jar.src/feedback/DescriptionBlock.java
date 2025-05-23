/*    */ package feedback;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\007\030\0002\0020\0012\0020\002B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006J\020\020\007\032\0020\b2\006\020\t\032\0020\nH\026J\024\020\013\032\0020\b2\n\020\f\032\0060\rj\002`\016H\026R\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lfeedback/DescriptionBlock;", "Lfeedback/FeedbackBlock;", "Lfeedback/TextDescriptionProvider;", "myLabel", "", "<init>", "(Ljava/lang/String;)V", "addToPanel", "", "panel", "Lcom/intellij/ui/dsl/builder/Panel;", "collectBlockTextDescription", "stringBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class DescriptionBlock implements FeedbackBlock, TextDescriptionProvider {
/*    */   @NotNull
/*    */   private final String myLabel;
/*    */   
/*    */   public DescriptionBlock(@NotNull String myLabel) {
/*  9 */     this.myLabel = myLabel;
/*    */   } public static final int $stable;
/*    */   public void addToPanel(@NotNull Panel panel) {
/* 12 */     Intrinsics.checkNotNullParameter(panel, "panel"); Panel panel1 = panel, $this$addToPanel_u24lambda_u241 = panel1; int $i$a$-apply-DescriptionBlock$addToPanel$1 = 0;
/* 13 */     Panel.row$default($this$addToPanel_u24lambda_u241, null, this::addToPanel$lambda$1$lambda$0, 1, null)
/*    */       
/* 15 */       .bottomGap(BottomGap.SMALL); } private static final Unit addToPanel$lambda$1$lambda$0(DescriptionBlock this$0, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); Row.text$default($this$row, this$0.myLabel, -1, null, 4, null); return Unit.INSTANCE; }
/*    */ 
/*    */ 
/*    */   
/*    */   public void collectBlockTextDescription(@NotNull StringBuilder stringBuilder) {
/* 20 */     Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder"); StringBuilder stringBuilder1 = stringBuilder, $this$collectBlockTextDescription_u24lambda_u242 = stringBuilder1; int $i$a$-apply-DescriptionBlock$collectBlockTextDescription$1 = 0;
/* 21 */     Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u242.append(this.myLabel), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u242.append(this.myLabel).append('\n'), "append(...)"); $this$collectBlockTextDescription_u24lambda_u242.append(this.myLabel).append('\n');
/* 22 */     Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u242.append('\n'), "append(...)"); $this$collectBlockTextDescription_u24lambda_u242.append('\n');
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\DescriptionBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */