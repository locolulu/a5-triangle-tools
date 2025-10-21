package triangle.abstractSyntaxTrees.visitors;

import triangle.abstractSyntaxTrees.AbstractSyntaxTree;
import triangle.abstractSyntaxTrees.actuals.ConstActualParameter;
import triangle.abstractSyntaxTrees.actuals.FuncActualParameter;
import triangle.abstractSyntaxTrees.actuals.ProcActualParameter;
import triangle.abstractSyntaxTrees.actuals.VarActualParameter;
import triangle.abstractSyntaxTrees.commands.DoWhileDoCommand;

public interface ActualParameterVisitor<TArg, TResult> {


    TResult visitConstActualParameter(ConstActualParameter ast, TArg arg);

	TResult visitFuncActualParameter(FuncActualParameter ast, TArg arg);

	TResult visitProcActualParameter(ProcActualParameter ast, TArg arg);

	TResult visitVarActualParameter(VarActualParameter ast, TArg arg);

}
